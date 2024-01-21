package enums;

public enum Who {
    SMALL("Ребёнок"),
    BIG("Взрослый");

    private final String who;

    Who(String whoIsWho) {
        this.who = whoIsWho;
    }

    public String getWho() {
        return who;
    }
}
