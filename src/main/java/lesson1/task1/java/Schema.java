public class Schema {
    static boolean doAndThenDoNotOrThenDoAnd(boolean a, boolean b, boolean c, boolean d) {
        return (a && b) && !(c || d);
    }

    public static void main(String[] args) {
        System.out.println(doAndThenDoNotOrThenDoAnd(false, false, false, false));
        System.out.println(doAndThenDoNotOrThenDoAnd(true, true, true, true));
        System.out.println(doAndThenDoNotOrThenDoAnd(false, true, false, true));
        System.out.println(doAndThenDoNotOrThenDoAnd(true, false, true, false));
        System.out.println(doAndThenDoNotOrThenDoAnd(true, true, false, false));
    }
}
