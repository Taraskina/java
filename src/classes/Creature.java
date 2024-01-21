package classes;

import enums.Condition;
import enums.Who;
import interfaces.Go;

public abstract class Creature implements Go {
    protected String name;
    protected Who who;
    protected Places place = Places.STORY;
    protected Condition condition;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Who getWho() {
        return who;
    }
    public void setWho(Who who) {
        this.who = who;
    }
/*
    public Condition getCondition(){return condition;}
    public void setCondition(Condition cond){
        this.condition = cond;
    }*/

}
