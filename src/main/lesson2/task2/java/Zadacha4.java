public class Zadacha4 {

  static void resultString(String s1, String s2) {

    boolean equals = s1.equals(s2);
    if (equals) {
      System.out.println("Итоговая строка в которой в которой есть элементы входящие и в первую и во второую строку  = " + s1);
    }
    String pattern = s1;
    String str12 ="";
    String str3 = "";
    for (int i = 0; i < s2.length(); i++) {
      if (pattern.contains(String.valueOf(s2.charAt(i)))) {
        str12+=s2.charAt(i);
        }
    }

    for (int i = 0; i < str12.length(); i++) {
      if (str3.contains(String.valueOf(str12.charAt(i)))) {
      }
      else str3=str3+str12.charAt(i);
    }
    System.out.println(str3);

  }

  public static void main(String[] args) {
    resultString("1213", "1126");
    resultString("hello", "world");
    resultString("ping", "pong");
    resultString("qwer", "asdf");
    resultString("post", "get");
    resultString("abs", "sss");
  }
}