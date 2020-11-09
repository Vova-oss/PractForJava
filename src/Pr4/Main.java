package Pr4;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    Shape figure;

    public Main() {
        super("simpleApp");
        setSize(700, 600);
        setLocation(500,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D gr2d = (Graphics2D) g;

        gr2d.setStroke(new BasicStroke(3));

        for(int i=0; i<20;i++) {
            int b = (int)(Math.random()*3);

            switch (b){
                case 0:
                    figure = new Oval();
                    break;
                case 1:
                    figure = new Triangle();
                    break;
                case 2:
                    figure = new Kvadrat();
            }
            figure.paint(g);

        }
    }
}
