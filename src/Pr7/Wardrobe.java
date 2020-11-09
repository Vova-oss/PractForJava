package Pr7;

public class Wardrobe  extends Furniture{

    String color;
    String material;
    String name;

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public String getName() {
        return name;
    }
}
