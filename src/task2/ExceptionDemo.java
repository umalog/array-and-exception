package task2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.FileSystemException;
import java.nio.file.NoSuchFileException;
import java.sql.SQLException;

public class ExceptionDemo {
    static Exception exception;
    static String result;

    public static void main(String[] args) {
        Wrapper w = new Wrapper(new C());
        try {
            result = w.doSome();
        } catch (FileSystemException e) {
            exception = e;
            result = "IO Error";
        } catch (Exception e) {
            exception = e;
            result = "Some Exception";
        } finally {
            RuntimeException newEx = new RuntimeException();
            newEx.addSuppressed(exception);
            newEx.addSuppressed(exception);

            throw newEx;
//            System.out.println("finally block");
        }
//        System.out.println(result);


        /* Idea намекает нам что что закрывать ресурс самим не надо
           если ресурс "упадет", а затем упадет close() - второе исклчение будет подавлено, но сохранится как Suppressed */
//        try (InputStream is = new FileInputStream("")) {
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}

class Wrapper {
    private B b;

    Wrapper(B b) {
        this.b = b;
    }

    String doSome() throws IOException {
//        try {
        return b.doSomeElse().substring(2);
//        } catch (IOException e) {
//            System.out.println("exception handled");
//            throw new SQLException(e);
//        } finally {
//            return "Все хорошо";
//        }
    }
}

class B {
    String doSomeElse() throws IOException {
        return "B.doSomeElse";
    }
}

/* сужение типа исключения при переопределении */
class C extends B {
    @Override
    String doSomeElse() throws NoSuchFileException {
        // Предположим, что в этот метод нельзя заходить в текущей реализации проекта
        throw new NoSuchFileException("Осмысленное сообщение о причине ошибки");
    }
}

class D extends B{
    @Override
    String doSomeElse(){
        return "it's OK";
    }
}