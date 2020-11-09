package Pr4;

import java.awt.*;

public class Kvadrat extends Shape {
    int r,g,b;
    int x,y,w,h;

    Kvadrat(){
        setColor();
        setPosition();
    }

    @Override
    public void setColor() {
        r = (int) (Math.random() * 255);
        b = (int) (Math.random() * 255);
        g = (int) (Math.random() * 255);
    }

    @Override
    public void setPosition() {
        x = (int) (Math.random()*500);
        y = (int) (Math.random()*500);
        w = (int) (Math.random()*200);
        h = (int) (Math.random()*200);
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D gr2d =  (Graphics2D) g;
        gr2d.setPaint(new Color(r, this.g, b));
        gr2d.drawRect(x,y,w,h);
    }
}
