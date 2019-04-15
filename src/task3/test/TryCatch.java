package task3.test;

public class TryCatch {
    public double testDivide(int a, int b) {
        double result = 5;
        try {
            result = a / b;
            return result;
        } catch (ArithmeticException e) {


        } finally {
            System.out.println("Finally");
        }
        return 0;
    }
}
