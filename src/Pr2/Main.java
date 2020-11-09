package Pr2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true) {
            System.out.println("Выберете номер: 1,2");
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();
            switch (i) {
                case 1:
                    new num1();
                    break;
                case 2:
                    new num2();
                    break;
                default:
                    System.out.println("Вы ввели неправильный номер. Повторите попытку.");
                    break;
            }
        }
    }
}
