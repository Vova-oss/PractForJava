package Pr18.part1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите натуральное число");
        Scanner sc = new Scanner(System.in);
        int el = sc.nextInt();
        System.out.println(1);
        search(el);
    }

    public static void search(int el){
        for(int i = 2;i<el+1;i++){
            if(el%i == 0){
                System.out.println(i);
                search(el/i);
                break;
            }
        }
    }
}
