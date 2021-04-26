public class Zadacha3<label149> {

  static void isPhoneLengthIsOk(String phoneNumber)
    {
    if (phoneNumber.length() == 16 && phoneNumber != null)

    {

      char firstChar;
      firstChar = phoneNumber.charAt(0);
      char secondChar;
      secondChar = phoneNumber.charAt(1);
      char thirdChar;
      thirdChar = phoneNumber.charAt(2);
      char sevenChar;
      sevenChar = phoneNumber.charAt(6);
      char elevenChar;
      elevenChar = phoneNumber.charAt(10);
      char foortheenChar;
      foortheenChar = phoneNumber.charAt(13);

      if (firstChar == '+' && secondChar == '7' && thirdChar == '(' && sevenChar == ')' && elevenChar == '-' && foortheenChar == '-')
      abc:{
        {
          String sub1;
          String pattern = "0123456789";
          sub1 = String.valueOf(phoneNumber.charAt(3)) + String.valueOf(phoneNumber.charAt(4)) + String.valueOf(phoneNumber.charAt(5)) + String.valueOf(phoneNumber.charAt(7)) + String.valueOf(phoneNumber.charAt(8)) + String.valueOf(phoneNumber.charAt(9)) + String.valueOf(phoneNumber.charAt(11) + String.valueOf(phoneNumber.charAt(12)) + String.valueOf(phoneNumber.charAt(14)) + String.valueOf(phoneNumber.charAt(15)));
          for (int i = 0; i < sub1.length() - 1; i++) {
            if (!(pattern.contains(String.valueOf(sub1.charAt(i))))) {
              //System.out.println(sub1.charAt(i));
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
    }

       else {
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



  }
}