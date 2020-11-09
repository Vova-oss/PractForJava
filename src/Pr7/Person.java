package Pr7;

import java.util.ArrayList;

public class Person {
    ArrayList<Furniture> box = new ArrayList<>();
    public String name;
    private ArrayList<Furniture> basket = new ArrayList<Furniture>();
    private FurnitureShop shop;

    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void getBox(){
        boolean flag = true;
        for (int i = 0; i < box.size(); i++) {
            System.out.println(box.get(i).getName() + "\nЦвет: " + box.get(i).getColor() + "\nМатериал: " + box.get(i).getMaterial());
            System.out.println();
            flag = false;
        }
        if (flag) {
            System.out.println("Пока что тут пусто");
        }
    }
    /*
    public void printBasket(){
        for(int i = 0; i<basket.size(); i++){
            System.out.println((i+1) + " покупка:");
            basket.get(i).info();
        }
    }

    public void addProduct(int productNumber){
        productNumber = productNumber - 1;
        basket.add(shop.getProduct(productNumber));
        shop.delete(productNumber);
    }
    */

}

