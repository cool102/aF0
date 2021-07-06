package lesson6Faq.task4;

import java.util.Random;

public class StringGenerator {


    public static String getRandomSerailNumber(IdentityDocumentType documentType) {
        switch (documentType) {
            case MILITARY_ID: //ББ 0999999
                return String.format(String.format("%s %s", randomString(2),randomDigitString(7)));
            case DIPLOMATIC_PASSPORT:
            case INTERNATIONAL_PASSPORT:

                return String.format(String.format("%s %s", randomDigitString(2),randomDigitString(7)));
            case FOREIGN_CITIZEN_PASSPORT:

                return String.format(String.format("%s", randomABCString((25))));
            case RUSSIAN_CITIZEN_PASSPORT:

                return String.format(String.format("%s %s %s", randomDigitString(2), randomDigitString(2),randomDigitString(7)));

        }
        throw new IllegalStateException("Неправильно введенный тип документа: " + documentType);
    }

    private static String randomString(int len){
        String pattern = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЫЭЮЯ";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            sb.append(pattern.charAt(new Random().nextInt(pattern.length())));
        }
        return sb.toString();
    }

    private static String randomABCString(int len){
        String pattern = "АBCDEEFGHIJKLOMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            sb.append(pattern.charAt(new Random().nextInt(pattern.length())));
        }
        return sb.toString();
    }

    private static String randomDigitString(int len){
        String pattern = "0123456789";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            sb.append(pattern.charAt(new Random().nextInt(pattern.length())));
        }
        return sb.toString();
    }
}
