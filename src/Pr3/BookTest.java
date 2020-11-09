package Pr3;

import java.util.Scanner;

public class BookTest {

    public static void main(String[] args) {
        while (true) {
            System.out.println("Выберете номер: 1, 2, 3");
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();
            switch (i) {
                case 1:
                    new num1();
                    break;
                case 2:
                    new Human();
                    break;
                case 3:
                    Book book = new Book("Александр Сергеевич Пушкин","Медный всадник", 1833,754);
                    System.out.println(book.getAuthor());
                    System.out.println(book.getName());
                    System.out.println(book.getPages());
                    System.out.println(book.getYear());

                    System.out.println();
                    book.setAuthor("Николай Васильевич Гоголь");
                    book.setName("Портрет");
                    book.setPages(253);
                    book.setYear(1835);

                    System.out.println(book.getAuthor());
                    System.out.println(book.getName());
                    System.out.println(book.getPages());
                    System.out.println(book.getYear());

                    break;
                default:
                    System.out.println("Вы ввели неправильный номер. Повторите попытку.");
                    break;
            }
        }
    }
}
