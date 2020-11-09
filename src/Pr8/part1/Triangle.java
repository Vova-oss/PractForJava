package Pr8.part1;

import java.awt.*;

public class Triangle extends Shape {
    private int r,g,b;
    private int x1,y1,x2,y2,x3,y3;

    public Triangle(){
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
