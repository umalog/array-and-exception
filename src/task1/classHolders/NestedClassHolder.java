package task1.classHolders;

public class NestedClassHolder {

    /* Агрегация */
    public static enum Type {
        SINGLE_CHOICE, MULIT_CHOICE, TEXT
    }


    /* Агрегация */
    static class StaticNestedClass {

        public StaticNestedClass() {
            System.out.println("Constructor NestedClass");
        }
    }


//    public interface -> public static interface
}
