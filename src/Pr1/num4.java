package Pr1;

import java.util.Random;

public class num4 {

    public num4() {
        int[] arr = new int [10];
        int[] arr1 = new int [10];

        System.out.print("Массив arr:");
        for(int i =0;i<10;i++){
            arr[i]= (int) (Math.random()*100);
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.print("\nМассив arr1:");

        for(int i =0;i<10;i++){
            Random random= new Random();
            arr1[i]= random.nextInt(10);
            System.out.print(arr1[i]);
            System.out.print(" ");
        }

        for (int i = 0; i < 10; i++){
            for (int j = i;j <= 9; j++){

                if(arr[i]<arr[j]){
                    int k = arr[i];
                    arr[i] = arr[j];
                    arr[j] = k;
                }

                if(arr1[i]<arr1[j]){
                    int k = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = k;
                }

            }
        }
        System.out.print("\nОтсортированный массив arr:");

        for(int i =0; i< 10; i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.print("\nОтсортированный массив arr1:");

        for(int i =0; i< 10; i++){
            System.out.print(arr1[i]);
            System.out.print(" ");
        }
        System.out.println();
    }
}
