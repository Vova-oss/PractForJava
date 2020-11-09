package Pr1;

import java.util.Scanner;

public class num5 {

    public num5() {
        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        int sum=1;
        for(int i=1;i<=ch;i++){
            sum=sum*i;
        }
        System.out.println("Факториал числа "+ch+" равен "+sum);
    }
}
