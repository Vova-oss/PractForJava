package Pr3;

import java.util.Scanner;

public class num1 {

    public num1() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите радиус окружности");
        double r = sc.nextInt();
        Circle circle = new Circle(r);

        System.out.println(circle.getDlina());
        System.out.println(circle.getSquare());

    }
}
