package Pr12;

public enum Planet {

    ELSE(-1,"Такой планеты не существует"),

    SUN(695_000,"1.99E30"),// Солнце
    MERCURY(2440,"3.30E23"),// Меркурий
    VENUS(6052,"4,87E24"), //Венера
    EARTH(6378,"5,97e24"), // Земля
    MARS(3397,"6,42E23"), //Марс
    JUPITER(71492,"1,90E27"), //Юпитер
    SATURN(60268,"5,68E26"),//Сатурн
    URANUS(25559,"8,68E25"), //Уран
    NEPTUNE(24766,"1,02E26"); // Нептун
    double r;
    String m;

    Planet(double r,String m) {
        this.r = r;
        this.m = m;
    }

}
