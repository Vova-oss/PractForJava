package Pr3;

public class Circle {

    public double r;

    Circle(double r){
        this.r = r;
    }

    public String getSquare(){
        return ("Площадь окружности равна " + Math.PI*r*r);
    }

    public String getDlina(){
        return ("Длина окружности равна " + Math.PI*2*r);
    }
}