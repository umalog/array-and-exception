package task1;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        /* Task 2 */
        String str = null;
        try {

            if (str.equals("message")) {
                System.out.println(str);
            }
        } catch (Exception ex) {
            System.out.println("EX");

//        } catch (NullPointerException npe) {
//            System.out.println("NPE");
//            return;
//        } catch (ArithmeticException are) {
//            System.out.println("ARE");
        } finally {
            str.equals("message");
            System.out.println("Finally");
        }
    }
}

// /* Task 1 */
//class A {
//
//    public A method() throws Throwable { // 1 
//        return new Single();
//    }
//}
//
//class Single extends A {
//
//    public Single method(String str) throws RuntimeException { // 2 
//        return new Single();}
//
//    public Single method() throws IOException {  //3 
//        return new Double();}
//}
//
//class Double extends Single {
//
//    public void method(Integer digit) throws ClassCastException {      // 4 
//    }
//
//    public Double method() {  // 5 
//        return new Double();}
//}
//
