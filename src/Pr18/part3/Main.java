package Pr18.part3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите построчно натуральные числа. При завершении впишите 0.");
        System.out.println(search());
    }

    public static int search(){
        Scanner sc = new Scanner(System.in);
        int el = sc.nextInt();
        int max = el;

        if(el!=0){
            int lgemax = search();
           if(max < lgemax){
               max = lgemax;
           }
        }

        return max;
    }

}
