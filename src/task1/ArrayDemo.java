package task1;

import java.util.Iterator;

/* Object[10][1000] || Object[1000][10] */

public class ArrayDemo {
    public static void main(String[] args) {

//        int[] arr = {2, 3, 5, 22, 34};
//        Integer[] arrB = new Integer[10];
//
//        for (int i : arr) {
//            System.out.println("int " + i);
//        }
//
//        Random rnd = new Random();
//        for (int i = 0; i < 5; i++) {
//            arrB[i] = rnd.nextInt(1000);
//        }
//
//        for (Integer integer : arrB) {
//            System.out.println("Integer " + integer);
//        }


//        /* примитив в массиве */
//        int arr1[] = new int[3];
//        arr1[1] = 1;
//        arr1[0] = 0;
//        System.out.println(arr1[2]);


        /* foreach реализуется через Iterable */
        MyArr myArr = new MyArr();
        for (Object o : myArr) {}

//        /* операторы прерывания */
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 10; j++) {
//                if (j == 5) {
////                    break MyLabel;
////                    return;
//                    break;
//                }
//                System.out.println(i + " - " + j);
//            }
//            break;
//        }
//        // куда надо поставить метку MyLabel для вывода этого сообщения:
//        System.out.println("Программа завершена");
    }


    /* почему эта реализация if правильная? */
    static String doSome() {
        if (false) {
            return "";
        }
        return "23";
    }
}

class MyArr implements Iterable {
    int count = 0;

    @Override
    public Iterator iterator() {
        return new Iterator() {
            @Override
            public boolean hasNext() {
                System.out.println("hasNext");
                return ++count != 3;
            }

            @Override
            public Object next() {
                System.out.println("next");
                return null;
            }
        };
    }
}
