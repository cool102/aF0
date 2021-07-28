package lesson11.task4;

import java.util.Objects;

public class Passport {
    private String serial;
    private String number;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return Objects.equals(serial, passport.serial) && Objects.equals(number, passport.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serial, number);
    }

    public Passport(String serial, String number) {
        this.serial = serial;
        this.number = number;
    }
}
