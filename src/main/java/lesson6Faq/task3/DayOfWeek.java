package lesson6Faq.task3;

public enum DayOfWeek {
    MONDAY("понедельник"),
    TUESDAY("вторник"),
    WEDNESDAY("среда"),
    THURSDAY("четверг"),
    FRIDAY("пятница"),
    SATURDAY("суббота");

    private final String description;

    DayOfWeek(String description) {
        this.description = description;
    }

    public String getDay() {
        return description;
    }
}
