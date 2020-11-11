package Pr20;

import java.io.*;
import java.util.*;

public class Main {

    static Map <String, Integer> dictionary;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("[1] - Узнать самое часто повторяющееся слово [2] - Заменить все пробелы на знак '#' [0] - Завершить программу");
            int choose = sc.nextInt();
            switch (choose){
                case 1:
                    dictionary = new HashMap<>();
                    work_with_output_file();
                    output_result();
                    break;
                case 2:
                    work_with_file(false, "","dop.txt");
                    replacement();
                    break;
                case 0:
                    return;
            }
        }
    }

    public static void replacement(){
        try {
            File file = new File("voyna-i-mir-tom-1.txt");
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
            while (line != null) {
                line = line.replace(' ','#');
                work_with_file(true,line,"dop.txt");
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        work_with_file(false,"","voyna-i-mir-tom-1.txt");

        try {
            File file = new File("dop.txt");
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
            while (line != null) {
                work_with_file(true,line,"voyna-i-mir-tom-1.txt");
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Замена прошла успешно");

    }

    public static void work_with_file(boolean append, String text, String name){
        try(FileWriter writer = new FileWriter(name, append))
        {
            writer.write(text);
            writer.write('\n');
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static void work_with_output_file(){
        try {
            File file = new File("voyna-i-mir-tom-1.txt");
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
            while (line != null) {
                String[] subStr;
                subStr = line.split(" ");
                for(int i=0;i<subStr.length; i++){
                    if(!subStr[i].equals("")){

                        if(dictionary.get(subStr[i])==null){
                            dictionary.put(subStr[i],1);
                        }else {
                            dictionary.put(subStr[i], dictionary.get(subStr[i]) + 1);
                        }
                        //System.out.print(subStr[i]);
                        //System.out.println(dictionary.get(subStr[i]));

                    }
                }
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void output_result(){

        Map <Integer, String> dwas = new HashMap<>();
        int sizeList = 0;
        System.out.println("Топ 10 самых часто встречающихся слов.");

        for(int j =0;j<10;j++) {


            int max = 0;
            String word = "";


            String allKeys = dictionary.keySet().toString();
            allKeys = allKeys.substring(1, allKeys.length() - 1);
            String[] massKeys = allKeys.split(", ");


            for (int i = 0; i < massKeys.length; i++) {
                //System.out.println(massKeys[i]);

                boolean flag = true;
                for(int k =0;k< dwas.size();k++){
                    if(massKeys[i].equals(dwas.get(k+1))){
                        flag = false;
                    }
                }

                if (dictionary.get(massKeys[i]) > max && flag && !massKeys[i].equals("-")) {
                    word = massKeys[i];
                    max = dictionary.get(massKeys[i]);
                } else dictionary.get(massKeys[i]);

                //System.out.println();
            }
            System.out.println(j+1+"ое слово: \"" + word + "\"");
            System.out.println("Оно стретилось " + max + " раз");

            sizeList++;
            dwas.put(sizeList,word);

        }

    }

}
