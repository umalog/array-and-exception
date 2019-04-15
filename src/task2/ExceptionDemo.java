package task2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;

public class ExceptionDemo {
    public static void main(String[] args) throws IOException {
        A a = new A(new C());
        String s = null;
        Exception exception = null;
        try {
            s = a.doSome();
        } catch (SQLException e) {
            exception = e;
            s = "Arithmetic IO Error";
        } catch (Exception e) {
            exception = e;
            s = "Arithmetic Error";
        } finally {
            RuntimeException newEx = new RuntimeException();
            newEx.addSuppressed(exception);
            //throw newEx;
            System.out.println("finally block");
        }
        System.out.println(s);

        try (InputStream is = new FileInputStream("")) {
            is.close();
        }
    }
}

class A {
    B b;

    public A(B b) {
        this.b = b;
    }

    String doSome() throws SQLException {
        try {
            return b.doSomeElse().substring(2);
        } catch (IOException e) {
            System.out.println("exception handled");
            throw new SQLException(e);
        } finally {
            return "Все хорошо";
        }

    }

    ;
}

class B {
    String doSomeElse() throws IOException {
        return "B.doSomeElse";
    }
}

class C extends B {
    int d;

    @Override
    String doSomeElse() throws IOException {
        // что-то пошло не так
        if (true) {
            throw new IOException("ля-ля-ля");
        }
        return "C.doSomeElse";
    }
}