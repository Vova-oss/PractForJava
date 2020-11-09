package Pr15;

import java.util.Scanner;

public class Main {

    class los{
        public int x;
        los next = null;
        los previous = null;
    }

    Scanner sc = new Scanner(System.in);

    los first = null;
    los last = null;

    public void addEl(){
        los current = new los();
        System.out.println("Введите значение нового элемента:");
        current.x = sc.nextInt();
        if(first==null) {
            first = current;
            last = current;
        }else{
            last.next = current;
            current.previous = last;
            last = current;
        }
    }

    public void deleteEl(){
        System.out.println("Введите значение элемента, который желаете удалить:");
        int x = sc.nextInt();
        los current = first;
        while (current!=null){
            if(current.x == x){
                if(current.previous!=null)
                    current.previous.next = current.next;
                else first = current.next;
                if(current.next!=null)
                    current.next.previous = current.previous;
                else last = current.previous;
                break;
            }
            current = current.next;
        }
        if(current == null){
            System.out.println("Данного элемента не существует в структуре данных");
        }
    }

    public void searchEl(){
        System.out.println("Введите значение элемента, который желаете найти:");
        int x = sc.nextInt();
        int i = 0;
        los current = first;
        while (current!=null){
            i++;
            if(current.x == x){
                System.out.println("Этот элемент находится на позиции "+i);
                break;
            }
            current = current.next;
        }
        if(current == null){
            System.out.println("Данного элемента не существует в структуре данных");
        }
    }

    public void searchEl1(){
        System.out.println("Введите индекс элемента, который желаете найти:");
        los current = first;
        int index = sc.nextInt();
        for(int i = 0;i<index-1;i++){
            if(current == null) {
                System.out.println("Данного элемета не существует в структуре данных");
                return;
            }
            current = current.next;
            if(current == null) {
                System.out.println("Данного элемета не существует в структуре данных");
                return;
            }
        }
        System.out.println("Значение элемента равно "+ current.x);
    }

    public void searchMax(){
        int max= 0;
        los current = first;
        while (current!=null){
            max = Math.max(current.x, max);
            current= current.next;
        }
        System.out.println("Максимальное значение элемента равно "+ max);
    }

    public void searchMin(){
        int min = 99999999;
        los current = first;
        while (current!=null){
            min = Math.min(current.x, min);
            current= current.next;
        }
        System.out.println("Минимальное значение элемента равно "+ min);
    }

    public void searchMiddle(){
        int middle = 0;
        int size = 0;
        los current = first;
        while (current!=null){
            size++;
            middle+=current.x;
            current= current.next;
        }
        System.out.println("Среднее арифметическое значение всех элементов равно "+ middle/size);
    }

    public void menu(){
        System.out.println("\nВыберете команду:");
        System.out.println("[1] - Добавление");
        System.out.println("[2] - Удаление");
        System.out.println("[3] - Поиск элемента по значению");
        System.out.println("[4] - Поиск элемента по индексу");
        System.out.println("[5] - Поиск максимального элемента");
        System.out.println("[6] - Поиск минимального элемента");
        System.out.println("[7] - Поиск среднего арифметического значения всех элементов");
        System.out.println("[8] - Вывод структуры на экран");
        System.out.println("[] - ");
        System.out.println("[0] - Завершение программы");

        System.out.println("Выбранная команда:");
        int choose = sc.nextInt();
        switch (choose){
            case 1:
                addEl();
                menu();
            case 2:
                deleteEl();
                menu();
            case 3:
                searchEl();
                menu();
            case 4:
                searchEl1();
                menu();
            case 5:
                searchMax();
                menu();
            case 6:
                searchMin();
                menu();
            case 7:
                searchMiddle();
                menu();
            case 8:
                output();
                menu();
            case 0:
                System.out.println("Программа завершена.");
                return;
            default:
                System.out.println("Вы ввели неверную команду. Повторите попытку.");
                menu();
        }
    }

    public void output(){
        los current = first;
        int i = 1;
        while (current!=null){
            System.out.print(i+"-"+current.x+" ");
            current = current.next;
            i++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.menu();
    }
}
