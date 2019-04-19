package task3.test;

public class Child extends Parent {
    static String childStaticString;

    static {
        childStaticString = "Значение дочерней статической переменной";
        System.out.println(childStaticString);
    }
    String childString = "нестатическая переменная";

    public Child() {
        System.out.println("А теперь конструктор дочернего класса. Все поля уже инициализированны. например: " + childString);
    }
}
