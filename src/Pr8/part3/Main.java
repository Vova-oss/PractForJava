package Pr8.part3;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main extends JFrame {

   static Image image;

    public Main() {
        super("simpleApp");
        setSize(700, 600);
        setLocation(500,300);
        setVisible(true);
    }

    public static void main(String[] args) throws IOException {
        new Main();
    }

    @Override
    public void paint(Graphics g) {
        int i = 0;
        while (true) {
            i = (i + 1)%7;
            String filename = "C:\\Users\\vovap\\Desktop\\Жепа\\ИКБО-10-19\\Лабы по Джаве\\Практические\\PrForJava8\\djn\\" + i + ".gif";
            try {
                Thread.sleep(1000);
                image = ImageIO.read(new File(filename));
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }

            super.paint(g);
            Graphics2D gr = (Graphics2D) g;
            gr.drawImage(image, 10, 10, null);
        }
    }
}
