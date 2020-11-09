package Pr7;

public abstract class Furniture {

    public abstract void setColor(String color);
    public abstract void setMaterial(String material);
    public abstract void setName(String name);

    public String generColor(){
        int rand = (int) (Math.random()*3);
        switch (rand){
            case 1:
                return "Синий";
            case 2:
                return "Красный";
            case 0:
                return "Фиолетовый";
        }
        return "Красный";
    }

    public String generMaterial(){
        int rand = (int) (Math.random()*3);
        switch (rand){
            case 1:
                return "Дерево";
            case 2:
                return "Железо";
            case 0:
                return "Форфор";
        }
        return "Дерево";
    }

    public abstract String getColor();
    public abstract String getMaterial();
    public abstract String getName();

}
