package task3.test;

public class Parent {
    static String parentString = "Значение родительской статической переменной";

    Parent() {
        System.out.println();
        System.out.println("А теперь конструктор родительского класса. Он может работать со всеми значениями, потому что последний");
    }
}
