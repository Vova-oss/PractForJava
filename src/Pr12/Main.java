package Pr12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Pr12.Planet.*;

public class Main extends JFrame {



    Main(){
        int r = (int) (Math.random()*20);
        System.out.println(r);

        GridBagLayout gridLayout = new GridBagLayout();
        setLayout(gridLayout);
        Container container = getContentPane();
        setLocation(1000,300);
        setSize(500,450);

        GridBagConstraints c = new GridBagConstraints();

        JLabel label = new JLabel("Введите название планеты");
        JTextField jtf = new JTextField(10);
        JButton jButton = new JButton("Узнать радиус и массу планеты");
        jtf.setPreferredSize(new Dimension(0,30));
        JLabel planetsrad = new JLabel("Радиус данной планеты:");
        JLabel planetsmass = new JLabel("Масса данной планеты:");
        JTextField textrad = new JTextField(16);
        JTextField textmas = new JTextField(16);



        c.gridy = 0;
        container.add(label,c);
        c.gridy = 1;
        container.add(Box.createVerticalStrut(10),c);
        c.gridy = 2;
        container.add(jtf,c);
        c.gridy = 3;
        container.add(Box.createVerticalStrut(10),c);
        c.gridy = 4;
        container.add(jButton,c);
        c.gridy = 5;
        container.add(Box.createVerticalStrut(10),c);
        c.gridy = 6;
        container.add(planetsrad,c);
        c.gridy = 7;
        container.add(Box.createVerticalStrut(10),c);
        c.gridy = 8;
        container.add(textrad,c);
        c.gridy = 9;
        container.add(Box.createVerticalStrut(10),c);
        c.gridy = 10;
        container.add(planetsmass,c);
        c.gridy = 11;
        container.add(Box.createVerticalStrut(10),c);
        c.gridy = 12;
        container.add(textmas,c);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String stroka = jtf.getText();
                textmas.setText(choose(stroka).m);
                textrad.setText(String.valueOf(choose(stroka).r));

            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
    public static Planet choose(String stroka){
        switch (stroka){
            case "Солнце":
                return SUN;
            case "Меркурий":
                return MERCURY;
            case "Венера":
                return VENUS;
            case "Земля":
                return EARTH;
            case "Марс":
                return MARS;
            case "Юпитер":
                return JUPITER;
            case "Сатурн":
                return SATURN;
            case "Уран":
                return URANUS;
            case "Нептун":
                return NEPTUNE;
            default:
                return ELSE;
        }
    }
}
