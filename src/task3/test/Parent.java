package task3.test;

public class Parent {
    static String parentStaticString;

    static {
        parentStaticString = "Значение родительской статической переменной";
        System.out.println(parentStaticString);
    }

    String parentString = "нестатическая переменная";

    Parent() {
        System.out.println("А теперь конструктор родительского класса. Все поля уже инициализированны. например: " + parentString);
    }
}
