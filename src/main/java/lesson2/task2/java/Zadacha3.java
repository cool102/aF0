public class Zadacha3 {

    static void isPhoneLengthIsOk1(String phoneNumber) {
        boolean matches = phoneNumber.matches("^[+][7][(]\\d{3}[)]\\d{3}[-]\\d{2}[-]\\d{2}$");
        System.out.println(matches ? "true1" : "false1");
    }


    static void isPhoneLengthIsOk(String phoneNumber) {
        if (phoneNumber != null) {
            if (phoneNumber.length() == 16) {

                char firstChar = phoneNumber.charAt(0);
                char secondChar = phoneNumber.charAt(1);
                char thirdChar = phoneNumber.charAt(2);
                char sevenChar = phoneNumber.charAt(6);
                char elevenChar = phoneNumber.charAt(10);
                char foortheenChar = phoneNumber.charAt(13);

                if (firstChar == '+' && secondChar == '7' && thirdChar == '(' && sevenChar == ')' && elevenChar == '-' && foortheenChar == '-')
                    abc:{
                        {
                            String sub1;
                            String pattern = "0123456789";
                            sub1 = String.valueOf(phoneNumber.charAt(3)) + (phoneNumber.charAt(4)) + (phoneNumber.charAt(5)) + (phoneNumber.charAt(7)) + (phoneNumber.charAt(8)) + (phoneNumber.charAt(9)) + (phoneNumber.charAt(11) + String.valueOf(phoneNumber.charAt(12)) + (phoneNumber.charAt(14)) + (phoneNumber.charAt(15)));
                            for (int i = 0; i < sub1.length() - 1; i++) {
                                if (!(pattern.contains(String.valueOf(sub1.charAt(i))))) {

                                    System.out.println("false");
                                    break abc;
                                }
                            }
                            System.out.println("true");
                        }
                    }
                else {
                    System.out.println("false");
                }
            } else {
                System.out.println("false");
            }
        } else {
            System.out.println("false");
        }
    }


    public static void main(String[] args) {
        isPhoneLengthIsOk("+7(912)632-10-64");
        isPhoneLengthIsOk("7(910)423-73-12");
        isPhoneLengthIsOk("89215310934");
        isPhoneLengthIsOk("+5(911)310-12-74");
        isPhoneLengthIsOk("+7(9fg)125-42-99");
        isPhoneLengthIsOk("+7(122)2342343");
        isPhoneLengthIsOk("");
        System.out.println("__________________________");
        isPhoneLengthIsOk1("+7(912)632-10-64");
        isPhoneLengthIsOk1("7(910)423-73-12");
        isPhoneLengthIsOk1("89215310934");
        isPhoneLengthIsOk1("+5(911)310-12-74");
        isPhoneLengthIsOk1("+7(9fg)125-42-99");
        isPhoneLengthIsOk1("+7(122)2342343");
        isPhoneLengthIsOk1("dsasdfdsfdsfsdfsdfsd");


    }
}