package Pr7;

import java.util.ArrayList;

public class FurnitureShop {

    ArrayList<Furniture> list= new ArrayList<>();
    Furniture furniture = null;

    FurnitureShop() {



        for(int i = 0;i < 4; i++){
            int rand = (int) (Math.random()*3);
            switch(rand){
                case 1:
                   // Wardrobe wardrobe = new Wardrobe();
                    furniture = new Wardrobe();
                    furniture.setColor(furniture.generColor());
                    furniture.setMaterial(furniture.generMaterial());
                    furniture.setName("Шкаф");
                   // furniture = furniture;
                    break;
                case 2:
                 //   Table table = new Table();
                    furniture = new Table();
                    furniture.setColor(furniture.generColor());
                    furniture.setMaterial(furniture.generMaterial());
                    furniture.setName("Стол");
                   // furniture = table;
                    break;
                case 0:
                   // Chair chair = new Chair();
                    furniture = new Chair();
                    furniture.setColor(furniture.generColor());
                    furniture.setMaterial(furniture.generMaterial());
                    furniture.setName("Кресло");
                  //  furniture = chair;
                    break;
            }

            list.add(furniture);

        }
        output();

    }

    public void output(){
        for (int i =0;i<list.size();i++) {
            System.out.println(list.get(i).getName() + " " + list.get(i).getColor() + " " + list.get(i).getMaterial());
            //System.out.println();
        }
    }

}

