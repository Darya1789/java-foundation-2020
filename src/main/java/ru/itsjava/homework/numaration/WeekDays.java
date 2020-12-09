package ru.itsjava.homework.numaration;

public enum WeekDays {
    MONDAY("понедельник"), TUESDAY("вторник"), WEDNESDAY("среда"), THURSDAY("четверг"),
    FRIDAY("пятница"), SATURDAY("суббота"), SUNDAY("воскресенье");

    private final String translate;

    WeekDays(String translate) {
        this.translate = translate;
    }

    @Override
    public String toString() {
        return "WeekDays{ " + this.name() + " -> " + translate + " }";
    }
}
