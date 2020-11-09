package Pr19;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text;
        boolean flag = true;

        while (true){
            System.out.println("[1] - Добавить информацию [2] - Перезаписать информацию [3] - Вывод информации на экран [0] - Завершить программу");
            int choose = sc.nextInt();
            switch (choose){
                case 1:
                    System.out.println("Введите строку:");
                    sc.nextLine();
                    text = sc.nextLine();
                    work_with_file(true,text);
                    break;
                case 2:
                    System.out.println("Введите строку:");
                    sc.nextLine();
                    text = sc.nextLine();
                    work_with_file(false,text);
                    break;
                case 3:
                    work_with_output_file();
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
        try(FileReader reader = new FileReader("notes.txt"))
        {
            // читаем посимвольно
            int c;
            while((c=reader.read())!=-1){

                System.out.print((char)c);
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

}
