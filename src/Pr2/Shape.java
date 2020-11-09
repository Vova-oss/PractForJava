package Pr2;

public class Shape {
    int i;

    public Shape() {
        i= (int) (Math.random()*100);
    }

    void getColor(){
        System.out.println("Желтый");
    }

    void setNumber(int i){
        this.i=i;
    }

    void getNumber(){
        System.out.println(i);
    }
}
