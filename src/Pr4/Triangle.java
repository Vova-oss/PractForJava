package Pr4;

import java.awt.*;

public class Triangle extends Shape {
    int r,g,b;
    int x1,y1,x2,y2,x3,y3,w,h;

    Triangle(){
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
        x1 = (int) (Math.random()*500);
        y1 = (int) (Math.random()*500);
        x2 = (int) (Math.random()*500);
        y2 = (int) (Math.random()*500);
        x3 = (int) (Math.random()*500);
        y3 = (int) (Math.random()*500);
        w = (int) (Math.random()*200);
        h = (int) (Math.random()*200);
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D gr2d =  (Graphics2D) g;
        gr2d.setPaint(new Color(r, this.g, b));

        Polygon j = new Polygon();
        j.addPoint(x1, y1);
        j.addPoint(x2, y2);
        j.addPoint(x3, y3);

        g.drawPolygon(j);
    }
}
