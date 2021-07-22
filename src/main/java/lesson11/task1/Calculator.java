package lesson11.task1;

public class Calculator {

    public static int summ(int...values){
        int sum =0;
        for(int x: values){
            sum += x;
        }
        return sum;
    }
    public static int multiplication(int...values){
        int resultOfmultiplication =1;
        for(int x: values){
            resultOfmultiplication *= x;
        }
        return resultOfmultiplication;
    }

}
