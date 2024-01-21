package classes;

import enums.Hours;
import enums.Time;

public class Places extends Unalive {
    public static Time time = Time.EVENING;
    public static Hours hours = Hours.ONE;

    public Places(String name) {
        this.name = name;
        System.out.printf("Создано место: %s. \n Время: %s. \n", name, time.getTime());
    }

    public static void setDay() {
        if (time == Time.DAY) {
            time = Time.EVENING;
            System.out.println("Наступил " + time.getTime());
        } else if (time == Time.EVENING) {
            time = Time.NIGHT;
            System.out.println("Наступила " + time.getTime());
        } else if (time == Time.NIGHT) {
            time = Time.MORNING;
            System.out.println("Наступило " + time.getTime());
        } else if (time == Time.MORNING) {
            time = Time.DAY;
            System.out.println("Наступил " + time.getTime());
        } else {
            time = Time.HOURS;
            System.out.println("Прошло " + time.getTime());
        }
    }

    public static void setTime(){
        if(hours == Hours.HOURS) {
            System.out.println("Прошло " + hours.getHours());
        } else {
            System.out.println("Прошло " + hours.getHours());
        }
    }

    @Override
    public String toString() {
        this.name = getName();
        return name;
    }

    public final static Places STORY = new Places("история");
    /*
    public final static Places NOWHERE = new Places("нигде");
    public final static Places HOME = new Places("дом");
    public final static Places STREET = new Places("улица");
    public final static Places STORY = new Places("история");
    */

    @Override
    public void setProperty(String property) {
        this.property = property;
    }

    @Override
    public String getProperty() {
        return property;
    }
}
