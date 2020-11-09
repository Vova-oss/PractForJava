package Pr18.part2;

import java.util.Scanner;

public class Main {

    public static String drow = "";
    public static int size;
    public static char [] mass;

    public static void main(String[] args) {

        System.out.println("Введите слово");
        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        mass = word.toCharArray();
        size = mass.length;

        translate(0);

        if(drow.equals(word)){
            System.out.println("YES");
        }else System.out.println("NO");
    }

    public static void translate(int i){
        if(i != size){
            String copy = drow;
            drow = "" + mass[i] + copy;
            translate(i+1);
        }
    }
}
