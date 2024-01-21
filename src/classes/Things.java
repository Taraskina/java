package classes;

import enums.Condition;

public class Things extends Creature {
    public static Things things;

    public Things() {
        this.name = "";
        System.out.println("Создано нечто");
    }

    public Things(String name) {
        this.name = name;
        System.out.println("Создано " + name);
    }

    public Things(String name, Condition c) {
        this.name = name;
        this.condition = c;
        System.out.println("Создано " + c + " " + name);
    }

    public Things(String name, Places p) {
        this.name = name;
        this.place = p;
        System.out.println("Создано " + name + " в " + p);
    }

    @Override
    public void go(Places place) {
        System.out.println(name + " перемещается в " + place);
        this.place = place;
    }

    @Override
    public String toString() {
        String name = this.getName();
        return name;
    }
}
