package Pr2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class num2 {
    public num2() {
        boolean flag = false;
        List<Dog> arr=new ArrayList<>();
        while (true) {
            System.out.println("Выберете номер: 1-Создать собаку,2-Выйти");
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();
            switch (i) {
                case 1:
                    System.out.println("Введите возраст и имя собаки");
                    Dog dog = new Dog(sc.nextInt(),sc.nextLine());
                    System.out.println("1-Унать имя собаки 2-узнать возраст собаки 3-переименовать собаку 4-изменить возраст 5-перевести года в человеческие 6-инфо");
                    switch (i) {
                        case 1:
                            dog.getName();
                            break;
                        case 2:
                            dog.getAge();
                            break;
                        case 3:
                            System.out.println("Введите имя");
                            dog.setName(sc.nextLine());
                            break;
                        case 4:
                            System.out.println("Введите возраст");
                            dog.setAge(sc.nextInt());
                            break;
                        case 5:
                            dog.getHumanAge();
                            break;
                        case 6:
                            System.out.println(dog.ToString());
                            break;
                        default:
                            System.out.println("Вы ввели неправильный номер. Повторите попытку.");
                            break;
                    }
                    arr.add(dog);
                    break;
                case 2:
                    flag = true;
                    break;
                default:
                    System.out.println("Вы ввели неправильный номер. Повторите попытку.");
                    break;
            }
            if(flag)break;
        }

    }
}
