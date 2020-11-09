package Pr2;

public class Dog {
    int age;
    String name;

    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void getHumanAge(){
        System.out.println("Человеческий возраст собаки:"+age*7);
    }

    public String ToString(){
        return "Этой собаке по имени "+name+" " +age+ " лет";
    }
}
