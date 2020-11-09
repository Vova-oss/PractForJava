package Pr8.part1;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    private Shape figure;

    public Main() {
        super("simpleApp");

        setSize(700, 600);
        setLocation(0,0);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }

    @Override
    public void paint(Graphics g) {

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
