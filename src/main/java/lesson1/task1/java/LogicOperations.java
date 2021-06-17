public class LogicOperations {
    static boolean doOperationOrThenInvertResult(boolean a, boolean b) {
        return !(a || b);
    }

    static boolean doInvertParametrsThenDoOperationAnd(boolean a, boolean b) {
        return !a && !b;
    }

    public static void main(String[] args) {
        System.out.println("Начинает работу первый метод...");
        System.out.println(doOperationOrThenInvertResult(false, false));
        System.out.println(doOperationOrThenInvertResult(false, true));
        System.out.println(doOperationOrThenInvertResult(true, false));
        System.out.println(doOperationOrThenInvertResult(true, true));
        System.out.println();
        System.out.println("Начинает работу второй метод...");
        System.out.println(doInvertParametrsThenDoOperationAnd(false, false));
        System.out.println(doInvertParametrsThenDoOperationAnd(false, true));
        System.out.println(doInvertParametrsThenDoOperationAnd(true, false));
        System.out.println(doInvertParametrsThenDoOperationAnd(true, true));

    }
}
