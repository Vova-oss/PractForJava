package Pr21;

import java.util.Scanner;

public class Main {

        public void exceptionDemo() {
            Scanner myScanner = new Scanner( System.in );
            System.out.print( "Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            //пытаемся выполнить
            try {
                System.out.println(2 / i);
            }
            // при исключении типа ArithmeticException перехватывает эту ошибку и выполняет то, что в блоке, не завершая работу
            catch (ArithmeticException e) {
                System.out.println("Некорректный ввод");
            }
            // данный блок всегда выполняется после конструкции try
            finally {
                System.err.println("Я всегда буду выводиться");
            }
        }


        public static void main(String[] args) {
            System.out.println(2.0 / 0.0);// Выводится Infinity, что означает бесконечность или же неопределённость
            Main exeption = new Main();
            exeption.exceptionDemo();
        }


}
