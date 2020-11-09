package Pr1;

public class num3 {

    public num3() {
        int [] mass={1,2,34,4,2};
        int sum=0;
        for(int i=0;i<5;i++){
            sum=sum+mass[i];
        }
        System.out.println("Цикл for:"+sum+"\n");
        int i=0;
        sum=0;
        while(i<5){
            sum=sum+mass[i];
            i++;
        }
        System.out.println("Цикл while:"+sum+"\n");
        i=sum=0;
        do{
            sum=sum+mass[i];
            i++;
        }while(i<5);
        System.out.println("Цикл do while:"+sum+"\n");
    }

}
