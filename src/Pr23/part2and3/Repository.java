package Pr23.part2and3;

public class Repository<T> {
    T[] mass;

    Repository(T[] mass) {
        this.mass = mass;
    }

    public T[] getMass() {
        return mass;
    }

    public void setMass(T[] mass) {
        this.mass = mass;
    }

    public void getElement(int i){
        if(i< mass.length && i>=0) {
            System.out.println(mass[i]);
        }
        else System.out.println("Элемента с таким индексом не существует");
    }
}
//fgh ghj yhn 1 243 83