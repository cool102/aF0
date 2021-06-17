import java.util.Arrays;

public class Zadacha4 {

    static void resultStringFromMatchedElements(String s1, String s2) {

        boolean equals = s1.equals(s2);
        if (equals) {
            System.out.println("Итоговая строка в которой в которой есть элементы входящие и в первую и во второую строку  = " + s1);
        }
        String pattern = s1;
        String str12 = "";
        String str3 = "";
        for (int i = 0; i < s2.length(); i++) {
            if (pattern.contains(String.valueOf(s2.charAt(i)))) {
                str12 += s2.charAt(i);
            }
        }

        for (int i = 0; i < str12.length(); i++) {
            if (str3.contains(String.valueOf(str12.charAt(i)))) {
            } else str3 = str3 + str12.charAt(i);
        }
        //System.out.println(str3);
        char[] str3alphabet = str3.toCharArray();
        Arrays.sort(str3alphabet);
        System.out.println(str3alphabet);
    }

    public static void main(String[] args) {
        resultStringFromMatchedElements("1213", "1126");
        resultStringFromMatchedElements("hello", "world");
        resultStringFromMatchedElements("ping", "pong");
        resultStringFromMatchedElements("qwer", "asdf");
        resultStringFromMatchedElements("post", "get");
        resultStringFromMatchedElements("abs", "sss");
    }
}