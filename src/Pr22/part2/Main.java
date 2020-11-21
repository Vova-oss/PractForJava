package Pr22.part2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import static java.util.Arrays.sort;

public class Main extends JFrame {

    Main(){
        GridBagLayout gridLayout = new GridBagLayout();
        setLayout(gridLayout);
        Container container = getContentPane();
        setLocation(1000,300);
        setSize(500,450);

        GridBagConstraints c = new GridBagConstraints();
        JButton searchB = new JButton("Search");
        JButton sortB = new JButton("Sort");
        JLabel l1 = new JLabel("<html>");
        JLabel l2 = new JLabel("<html>");
        JLabel l3 = new JLabel("Введите имя, которое желаете найти");
        JTextField textField = new JTextField(16);

        c.gridy = 0;
        container.add(sortB,c);
        c.gridy = 1;
        container.add(Box.createVerticalStrut(10),c);
        c.gridy = 2;
        container.add(l1,c);
        c.gridy = 3;
        container.add(Box.createVerticalStrut(10),c);
        c.gridy = 4;
        container.add(searchB,c);
        c.gridy = 5;
        container.add(Box.createVerticalStrut(10),c);
        c.gridy = 6;
        container.add(l3,c);
        c.gridy = 7;
        container.add(Box.createVerticalStrut(10),c);
        c.gridy = 8;
        container.add(textField,c);
        c.gridy = 9;
        container.add(Box.createVerticalStrut(10),c);
        c.gridy = 10;
        container.add(l2,c);

        sortB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String text = "<html>";
                for (int i=0;i<7;i++){
                    text +=mass[i].getiDNumber() + " " + mass[i].getName() + " " + mass[i].getMark() + "<br>";
                }
                l1.setText(text);
            }
        });

        searchB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                boolean flag = false;
                for (int i=0;i<7;i++) {
                    if (mass[i].getName().equals(textField.getText())) {
                        l2.setText(mass[i].getiDNumber() + " " + mass[i].getName() + " " + mass[i].getMark());
                        flag = true;
                        break;
                    }
                }
                if(!flag){
                    l2.setText("Такого имени не существует");
                }
            }
        });

        setVisible(true);
    }

    public static StudentIn mass [] = new StudentIn[7];

    public static void main(String[] args) {
        new Main();

        String nameMass[] = {"Вова", "Женя", "Денис", "Коля", "Ваня", "Саша", "Полина"};



        for (int i = 0;i<7;i++){
            Random random = new Random();
            Student student = new Student((int) (Math.random()*100),nameMass[i],(int) (Math.random()*10));
            mass[i] = student;
        }
        printMass();

        sort(mass);
        printMass();

    }

    public static void printMass(){
        System.out.println("---------------------");
        for(int i=0;i<7;i++){
            System.out.println(mass[i].getiDNumber()+" "+mass[i].getName()+" "+mass[i].getMark());;
        }
    }

}
