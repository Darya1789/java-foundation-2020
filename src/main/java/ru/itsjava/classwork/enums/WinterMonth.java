package ru.itsjava.classwork.enums;

public enum WinterMonth {
    DECEMBER("Я перед НГ"), JANUARY("Я после НГ"), FEBRUARY("Я совсем после НГ");

    private final String addInfo;
    WinterMonth(String addInfo) {
        this.addInfo = addInfo;
    }

    @Override
    public String toString() {
        return "WinterMonth{" + this.name() +
                "(addInfo='" + addInfo + '\'' + ")" +
                '}';
    }
}
