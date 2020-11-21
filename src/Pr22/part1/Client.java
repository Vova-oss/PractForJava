package Pr22.part1;

import java.util.Scanner;

public class Client {

    String name;
    int IIN;

    public String getName(){
        System.out.println("Введите ваше имя");
        return (new Scanner(System.in)).next();
    }

    public int getIIN(){
        System.out.println("Введите ваш иин");
        return (new Scanner(System.in)).nextInt();
    }
}
