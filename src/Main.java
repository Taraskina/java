/*
Мама вздохнула: На следующий день они дали объявление в газете.
Но позвонила им только одна женщина. Звали ее фрекен Бок.
Несколько часов спустя она пришла договариваться о месте.
У Малыша как раз разболелось ухо, и ему хотелось быть возле мамы.
Лучше всего было бы сесть к ней на колени, хотя, собственно говоря, для этого он уже был слишком большой.
 */

import classes.Human;
import classes.Places;
import classes.Things;
import enums.Condition;
import enums.Hours;
import enums.Time;
import enums.Who;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n");
        System.out.println("************** Начало **************");
        System.out.println("\n");

        Places home = new Places("Дом Малыша");
        Places bookHouse = new Places("Книжное издательство");
        Places bed = new Places("Кровать");

        System.out.println("\n");

        Human mom = new Human("Мама", Who.BIG, Places.STORY);
        Human bok = new Human("Некая женщина", Who.BIG, Places.STORY);
        Human malish = new Human("Малыш", Who.SMALL, Places.STORY);

        System.out.println("\n");

        mom.doingSmf("делает", "вздох");

        malish.go(bed);
        mom.go(bed);
        while (!(Places.time == Time.MORNING)) {
            Places.setDay();
            malish.sleep();
            mom.sleep();
        }

        System.out.println("\n");

        mom.go(bookHouse);
        malish.go(bookHouse);

        Places newspaper = new Places("газета");
        Things news = new Things("объявление", newspaper);
        mom.go(home);
        malish.go(home);

        System.out.println("\n");

        bok.doingSmf("увидела", news.getName());
        bok.doingSmf("позвонила", mom.getName());
        bok.newName("Фрёкен Бок");
        bok.setName("Фрёкен Бок");
        Places.hours = Hours.HOURS;
        Places.setTime();
        bok.go(home);

        System.out.println("\n");

        malish.sick();
        malish.setCondition(Condition.ILLNESS);
        malish.showCondit("ухо болит");
        malish.doingSmf("хочет быть около", mom.getName());
        malish.doingSmf("хочет быть на коленях", mom.getName());
        //malish.doingSmf(malish.getCondition(), malish.getName());


        malish.setWho(Who.BIG);
        malish.showAge();
        malish.doingSmf("не может быть на коленях", mom.getName());
        System.out.println("\n");
        System.out.println("************** Конец **************");

        System.out.println("\n");

        //конец истории начало тестов
        Human Bok = new Human("Фрёкен Бок 2.0", Who.BIG, Places.STORY);
        Bok.setCondition(Condition.HAPPY);
        System.out.println(malish.toString());
        System.out.println("Bok == Bok2.0 :" + bok.equals(Bok));
        System.out.println(bok.hashCode());
        System.out.println(Bok.hashCode());
        Places.STORY.setName("v");
    }
}