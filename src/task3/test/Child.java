package task3.test;

public class Child extends Parent {
    static String childString = "Значение дочерней статической переменной";

    public Child() {
        System.out.println();
        System.out.println("А теперь конструктор дочернего класса. Он может работать со всеми значениями, потому что самый последний");
    }
}
