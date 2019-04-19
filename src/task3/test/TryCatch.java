package task3.test;

public class TryCatch {
    public double testDivide(int a, int b) {
        double result;
        try {
            result = a / b;
            return result;
        } catch (ArithmeticException e) {
            System.out.println("catch: " + e.getMessage());
        } finally {
            System.out.println("Finally");
        }
        return 0;
    }
}
