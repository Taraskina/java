package enums;

public enum Condition {
    NORM("обычный"),
    SAD("грустный"),
    HAPPY("счастливый"),
    TERRIBLE("взволнованный"),
    ILLNESS("болеющий"),
    LONELY("одинокий");

    private final String condit;
    Condition(String cond) {
        this.condit = cond;
    }
    public String getValue(){
        return condit;
    }
}
