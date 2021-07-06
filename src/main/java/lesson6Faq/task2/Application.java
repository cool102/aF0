package lesson6Faq.task2;

import lesson6Faq.task2.generators.HumanGenerator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application {
    public static void main(String[] args) {


        Set<Human> setOfHuman = new HashSet<>();

        for (int i = 0; i < 2000; i++) {
            setOfHuman.add(HumanGenerator.generateHuman());
        }

        Iterator<Human> iterator = setOfHuman.iterator();
        while (iterator.hasNext()) {
            Human human = iterator.next();
            Set<TypeOfPhone> typeOfPhones = human.getPhonesOfHuman().keySet();
            if (typeOfPhones.contains(TypeOfPhone.HOMEPHONE)
                    && typeOfPhones.contains(TypeOfPhone.WORKPHONE)
                        && typeOfPhones.contains(TypeOfPhone.MOBILEPHONE))
            {
                System.out.printf("%s %s,возраст %d, тел: дом %s, раб. %s, моб. %s\n", human.getName(), human.getSurname(), human.getAge(), human.getPhonesOfHuman().get(TypeOfPhone.HOMEPHONE), human.getPhonesOfHuman().get(TypeOfPhone.WORKPHONE), human.getPhonesOfHuman().get(TypeOfPhone.MOBILEPHONE));
            }
            if (typeOfPhones.contains(TypeOfPhone.HOMEPHONE)
                    || typeOfPhones.contains(TypeOfPhone.WORKPHONE)
                        || typeOfPhones.contains(TypeOfPhone.MOBILEPHONE))
                iterator.remove();
        }
        System.out.println("Количество людей после удаления" + setOfHuman.size());

    }
}
