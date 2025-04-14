package Tarea4_Ejercicios;

import java.util.function.Predicate;

public class Ej1 {
    public static void main(String[] args) {
        Predicate<Integer> mayorQue100 = a -> a > 100;

        System.out.println(mayorQue100.test(10));
        System.out.println(mayorQue100.test(150));
    }
}
