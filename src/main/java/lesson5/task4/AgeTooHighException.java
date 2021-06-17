package lesson5.task4;

public class AgeTooHighException extends RuntimeException {
    public AgeTooHighException() {
        super("Слишком большой возраст");
    }
}
