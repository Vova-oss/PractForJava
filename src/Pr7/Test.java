package Pr7;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    Test(){
        FurnitureShop fs = new FurnitureShop();
        Scanner sc = new Scanner(System.in);

        Person person1 = null;
        String meb;
        String col;
        String mat;
        ArrayList<Person> person = new ArrayList<>();




        while (true) {
            System.out.println("1 - Добавить покупателя  2 - Вывести список покупателей и их корзины");
            int what = sc.nextInt();
            switch(what){
                case 1:
                    System.out.println("Введите имя покупателя");
                    person1 = new Person(sc.next());
                    break;
                case 2:
                    for(int i =0;i<person.size();i++){
                        System.out.println("Корзина ("+person.get(i).getName()+")");
                        person.get(i).getBox();
                    }
                    System.out.println();
                    break;
            }
            L2:{
            while (true) {


                    System.out.println("1 - Купить мебель 2 - Посмотреть корзину 3 - Вывести склад 4 - Выйти");
                    int choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("Выберете продукцию:");
                            System.out.println("Шкаф, Кресло, Стол");
                            meb = sc.next();
                            System.out.println("Выберете цвет:");
                            System.out.println("Красный, Синий, Фиолетовый");
                            col = sc.next();
                            System.out.println("Выберете материал:");
                            System.out.println("Дерево, Железо, Форфор");
                            mat = sc.next();

                            L1:
                            {
                                for (int i = 0; i < fs.list.size(); i++) {
                                    if (fs.list.get(i).getName().equals(meb) && fs.list.get(i).getColor().equals(col) && fs.list.get(i).getMaterial().equals(mat)) {
                                        person1.box.add(fs.list.get(i));
                                        fs.list.remove(i);
                                        System.out.println("Успешно добавлено в корзину");
                                        break L1;
                                    }
                                }
                                System.out.println("Такой продукции нет на складе");
                            }
                            break;
                        case 2:
                            System.out.println("Ваша корзина:");
                            boolean flag = true;
                            for (int i = 0; i < person1.box.size(); i++) {
                                System.out.println(person1.box.get(i).getName() + "\nЦвет: " + person1.box.get(i).getColor() + "\nМатериал: " + person1.box.get(i).getMaterial());
                                System.out.println();
                                flag = false;
                            }
                            if (flag) {
                                System.out.println("Пока что тут пусто");
                            }
                            break;
                        case 3:
                            fs.output();
                            break;
                        case 4:
                            boolean flag2 = false;
                            for (int i = 0;i<person.size();i++){
                                if(person.get(i).getName().equals(person1.getName())){
                                    flag2 = true;
                                }
                            }
                            if (!flag2)person.add(person1);
                            break L2;
                    }
                }

            }


        }
    }

}
