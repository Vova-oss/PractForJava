package Pr6;

public class MovablePoint implements Movable {

    public float x,y;

    @Override
    public void setSpeed(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void setX(float x){
        this.x =x;
    }

    public void setY(float y){
        this.y =y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

}
