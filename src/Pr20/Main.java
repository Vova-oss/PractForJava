package Pr20;

import java.io.*;
import java.util.*;

public class Main {

    static Map <String, Integer> dictionary;
    static Stack<String> keyList = new Stack<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text;
        boolean flag = true;

        while (true){
            System.out.println("[1] - Заменить все пробелы на знак '#' [2] - Узнать самое часто повторяющееся слово [0] - Завершить программу");
            int choose = sc.nextInt();
            switch (choose){
                case 1:

                    break;
                case 2:
                    dictionary = new HashMap<>();
                    work_with_output_file();
                    output_result();
                    break;
                case 0:
                    return;
            }
        }
    }

    public static void work_with_file(boolean append, String text){
        try(FileWriter writer = new FileWriter("notes.txt", append))
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
            File file = new File("wap.txt");
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

                        keyList.push(subStr[i]);
                    }
                }
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void output_result(){
        int max = 0;
        String word = "";



        String allKeys = dictionary.keySet().toString();
        allKeys = allKeys.substring(1,allKeys.length()-1);
        String [] massKeys = allKeys.split(", ");



        for (int i =0;i<massKeys.length;i++){
            //System.out.println(massKeys[i]);
            if(dictionary.get(massKeys[i]) > max){
                word = massKeys[i];
                max = dictionary.get(massKeys[i]);
            }else dictionary.get(massKeys[i]);

            //System.out.println();
        }
        System.out.println("Самое часто встречающееся слово это \"" +  word +"\"");
        System.out.println("Оно стретилось " +  max+ " раз");
    }

}
