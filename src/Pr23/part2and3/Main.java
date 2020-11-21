package Pr23.part2and3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] mass = new String[3];
        Integer[] mas = new Integer[3];
        System.out.println("Введите 3 строки");
        for(int i=0;i<3;i++){
            mass[i] = sc.next();
        }
        System.out.println("Введите 3 числа");
        for(int i=0;i<3;i++){
            mas[i] = sc.nextInt();
        }
        Repository<String> stringRep = new Repository(mass);
        Repository<Integer> intRep = new Repository(mas);

        stringRep.getElement(2);
        stringRep.getElement(100);
        stringRep.getElement(-23);
        intRep.getElement(1);

    }

}
