package Pr8.part2;

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
        System.out.println("Введите расположение файла");
        Scanner sc = new Scanner(System.in);
        String filename = sc.next();
        image = ImageIO.read(new File(filename));
        new Main();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D gr = (Graphics2D)g;
        gr.drawImage(image, 10, 10, null);
    }
}
