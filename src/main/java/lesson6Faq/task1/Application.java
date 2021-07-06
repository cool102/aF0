package lesson6Faq.task1;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Human> humans = new ArrayList<>();
        for (int i = 0; i < 500; i++) {
            humans.add(i, new Human(NameGenerator.generateName(), NameGenerator.generateName(),
                    AgeGenerator.generateAge(), PhoneGenerator.generatePhone()));
        }
        for (Human current : humans) {
            if (current.getAge() == 35) {
                System.out.printf("%s %s,возраст %d, тел.%s\n", current.getSurname(), current.getName(), current.getAge(), current.getPhoneNumber());
            }

        }
    }
}
