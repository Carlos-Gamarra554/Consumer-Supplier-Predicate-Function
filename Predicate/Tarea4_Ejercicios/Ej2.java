package Tarea4_Ejercicios;

import java.util.function.Predicate;

public class Ej2 {
    public static void main(String[] args) {
        Predicate<Integer> entre100y300 = a -> a >= 100 && a <= 300;

        System.out.println(entre100y300.test(400));
        System.out.println(entre100y300.test(150));
    }
}
