package enums;

public enum Time {
    MORNING("утро"),
    DAY("день"),
    EVENING("вечер"),
    NIGHT("ночь"),
    HOURS("пара часов");

    private final String time;
    Time(String time) {
        this.time = time;
    }

    public String getTime(){
        return time;
    }
}
