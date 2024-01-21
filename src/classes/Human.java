package classes;

import enums.Condition;
import enums.Time;
import enums.Who;
import interfaces.ConditMoment;
import interfaces.Doing;

import java.util.Objects;

public class Human extends Creature implements Doing, ConditMoment {

    Boolean isSick = false;
    Condition condition = Condition.NORM;
    Who age = Who.BIG;

    public Human() {
        this.name = "Без имени";
        System.out.println("Безымянный некто появляется в истории");
    }

    public Human(String name) {
        this.name = name;
        System.out.println("Кто-то по имени " + name + " появляется в истории");
    }

    public Human(String name, Who who) {
        this.name = name;
        this.who = who;
        System.out.println(who.getWho() + " по имени " + name + " появляется в истории");
    }

    public Human(String name, Who who, Places places) {
        this.name = name;
        this.who = who;
        this.place = places;
        System.out.println(who.getWho() + " по имени " + name + " появляется в " + places);
    }


    @Override
    public void showCondit(String reason) {
        switch (condition) {
            case SAD -> System.out.println(name + " испытывает грусть, потому что " + reason);
            case NORM -> System.out.println(name + " испытывает обычное состояние");
            case HAPPY -> System.out.println(name + " испытывает радость, потому что " + reason);
            case LONELY -> System.out.println(name + " испытывает одиночество, потому что " + reason);
            case TERRIBLE -> System.out.println(name + " испытывает волнение, потому что " + reason);
            case ILLNESS -> System.out.println(name + " испытывает слабость, потому " + reason);
        }


    }

    @Override
    public void showAge() {
        switch (age) {
            case BIG -> System.out.println(name + " стал взрослым");
            case SMALL -> System.out.println(name + " стал ребёнком");
        }
    }

    @Override
    public void doingSmf(String doing, String smf) {
        System.out.println(name + " " + doing + " " + smf);
    }

    @Override
    public void newName(String newName) {
        System.out.println(name + " зовут " + newName);
    }

    @Override
    public void go(Places place) {
        System.out.println(name + " перемещается в " + place);
        this.place = place;
    }

    public void sleep() {
        if (Places.time == Time.NIGHT) {
            System.out.println(name + " спит");
        } else if (Places.time == Time.MORNING) {
            System.out.println(name + " проснулся");
        }
    }

    public void sick() {
        if (this.isSick) {
            System.out.println(this.name + " выздоровел!");
            this.isSick = false;
        } else {
            System.out.println(this.name + " заболел!");
            this.isSick = true;
        }
    }
    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public Condition getCondition() {
        return condition;
    }

    @Override
    public String toString() {
        return "Class Classes.Human{" +
                "name='" + name + '\'' +
                ", age=" + who.getWho() +
                ", place=" + place.getName() +
                ", condition=" + condition.getValue() +
                ", sick:" + isSick +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human human)) return false;
        return Objects.equals(getWho(), human.getWho());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}
