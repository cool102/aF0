package lesson6Faq.task4;

import java.util.*;

public class App {
    public static void main(String[] args) {
        List<Person> personsList = new ArrayList<>();
        for (int i = 0; i < 500; i++) {
            personsList.add(Person.random());
            }

        Map<IdentityDocumentType, Integer> counters = new TreeMap<>();
        for (IdentityDocumentType documentType : IdentityDocumentType.values()) {
            counters.put(documentType, 0);
        }

        for (Person person : personsList) {
            IdentityDocumentType docType = person.getidentityDocument().getIdentityDocumentType();
            counters.put(docType, counters.get(docType) + 1);
        }

        // Создадим список кодов документа, отсортированный в порядке убывания:
        List<String> identityDocumentTypeCodes = new ArrayList<>();
        for (IdentityDocumentType documentType : IdentityDocumentType.values()) {
            identityDocumentTypeCodes.add(documentType.getCode());
        }
        Collections.sort(identityDocumentTypeCodes);
        Collections.reverse(identityDocumentTypeCodes);

        // Выводим информацию на экран
        for (String code : identityDocumentTypeCodes) {
            IdentityDocumentType documentType = IdentityDocumentType.byCode(code);
            System.out.printf("%s (%s): %d%n", documentType.getDescriptionOfDocument(), code, counters.get(documentType));
        }

        // Удаляем всех людей, у кого код документа не равен "21"
        Iterator<Person> iterator = personsList.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (!person.getidentityDocument().getIdentityDocumentType().getCode().equals("21"))
                iterator.remove();
        }

        System.out.println("Количество людей в списке c кодом 21: " + personsList.size());

    }
}
