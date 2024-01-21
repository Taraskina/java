package enums;

public enum Hours {
    HOURS("пара часов"),
    ONE("1 час");

    private final String hours;
    Hours(String h) {
        this.hours = h;
    }

    public String getHours(){
        return hours;
    }
}
