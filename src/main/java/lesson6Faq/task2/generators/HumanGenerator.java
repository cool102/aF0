package lesson6Faq.task2.generators;


import lesson6Faq.task2.Chance;
import lesson6Faq.task2.Human;
import lesson6Faq.task2.TypeOfPhone;

import java.util.HashMap;
import java.util.Map;

public class HumanGenerator {


    public static Human generateHuman() {
        String firstName = NameGenerator.generateName();
        String surname = NameGenerator.generateName();
        int age = AgeGenerators.generateAge();
        Map<TypeOfPhone, String> phonesOfHuman = new HashMap<>();
        for (int i = 0; i < TypeOfPhone.values().length; i++) {
            if (Chance.calculateChance(20)) {
                TypeOfPhone phoneType = TypeOfPhone.values()[i];
                phonesOfHuman.put(phoneType, PhoneNumberGenerator.generatePhoneNumber());
            }

        }
        return new Human(surname, firstName, age, phonesOfHuman);
    }
}
