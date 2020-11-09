package Pr6;

public class MovableRectangle extends Kvadrat implements Movable {

    public float x,y;

    @Override
    public void setSpeed(float x, float y) {
        this.x = x;this.y = y;
    }

    public void getSpeed(){
        System.out.println("Скорость прямоугольника по иксу равна " + x);
        System.out.println("Скорость прямоугольника по игрику равна " + y);
    }

    public void compare (MovablePoint x, MovablePoint y){
        if(x.getX() == y.getX()&& x.getY() == y.getY()){
            System.out.println("Точки прямоугольника двигаются с одинаковой скоростью");
        }else{
            System.out.println("Точки двигаются с различной скоростью");
        }
    }
}
