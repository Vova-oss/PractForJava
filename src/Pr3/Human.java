package Pr3;

import java.util.Scanner;

public class Human {
    public Human() {

        Head head = new Head("синий");
        head.getColor();
        System.out.println("Введите цвет");
        Scanner sc = new Scanner(System.in);
        head.setColor(sc.nextLine());
        head.getColor();

        Hand hand = new Hand();
        hand.getQuantity();
        hand.getQuantityFingers();

        Leg leg = new Leg();
        leg.getQuantity();
        leg.getQuantityFingers();

    }
}
