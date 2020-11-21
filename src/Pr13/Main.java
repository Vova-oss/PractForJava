package Pr13;

import java.util.Collections;
import java.util.Random;

import static java.util.Arrays.sort;

public class Main {
    public static Student mass [] = new Student[7];

    public static void main(String[] args) {
        String nameMass[] = {"Вова", "Женя", "Денис", "Коля", "Ваня", "Саша", "Полина"};



        for (int i = 0;i<7;i++){
            Random random = new Random();
            Student student = new Student((int) (Math.random()*100),nameMass[i],(int) (Math.random()*10));
            mass[i] = student;
        }
        printMass();

        sort(mass);
        printMass();

        sort(mass,new SortingStudensByGPA());
        printMass();

    }

    public static void printMass(){
        System.out.println("---------------------");
        for(int i=0;i<7;i++){
            System.out.println(mass[i].getiDNumber()+" "+mass[i].getName()+" "+mass[i].getMark());;
        }
    }

}
