package Pr22.part1;

public class Abibas {

    public void buy(){
        System.out.println("Заказ оформлен.Введите ФИО и ИИН для оплаты");
    }

    public void chek(int correct,int which){
        if(correct == which){
            System.out.println("Оплата прошла успешно");
        }else System.out.println("ИИН введёт не верно");
    }

}
