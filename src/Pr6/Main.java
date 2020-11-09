package Pr6;

import javax.swing.*;
import java.util.Scanner;

public class Main extends JFrame {

    public static void main(String[] args) {
        MovableRectangle rect = new MovableRectangle();
        MovablePoint x = new MovablePoint();
        MovablePoint y = new MovablePoint();

       first:{
        rect.setSpeed(4,2);
        x.setSpeed(0,0);
        y.setSpeed(8,4);
           System.out.println("Изначально прямоугольник имеет длину по иксу 8, ширину по игрикн 4, располагает слева вверху");
            while (true) {
                System.out.println("1-Установить скорость прямоугольника, 2-Узнать скорость, 0-Завершение программы");
                Scanner sc = new Scanner(System.in);
                int choice = sc.nextInt();
                switch (choice) {
                    case 0:
                        break first;
                    case 1:
                        System.out.println("Введите координаты центра прямоугольника");
                        float x1 = sc.nextFloat();
                        float y1 = sc.nextFloat();
                        rect.setSpeed(Math.abs(rect.getX() - x1),Math.abs(rect.getY() - y1));
                        System.out.println("Введите координаты левой верней точки прямоугольника");
                        x1 = sc.nextFloat();
                        y1 = sc.nextFloat();
                        x.setSpeed(Math.abs( x.getX() - x1),Math.abs(x.getY() - y1));
                        System.out.println("Введите координаты правой нижней точки прямоугнольника");
                        x1 = sc.nextFloat();
                        y1 = sc.nextFloat();
                        y.setSpeed(Math.abs(y.getX() - x1),Math.abs(y.getY() - y1));
                        break;
                    case 2:
                        rect.getSpeed();
                        rect.compare(x,y);
                        break;
                }
            }
         }


    }
}