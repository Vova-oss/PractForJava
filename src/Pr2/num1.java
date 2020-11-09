package Pr2;

import java.util.Scanner;

public class num1 {
    public num1() {
        Shape shape = new Shape();
        shape.getColor();
        shape.getNumber();
        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        shape.setNumber(i);
        shape.getNumber();
    }
}
