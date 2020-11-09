package Pr3;

public class Head {

    String color;

    public Head(String color) {
        this.color = color;
    }

    void setColor(String color){
        this.color=color;
    }

    void getColor(){
        System.out.println("На голове волосы имеют "+color+" цвет");
    }

}
