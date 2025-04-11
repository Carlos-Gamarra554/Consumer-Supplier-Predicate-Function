package Ejercicios;

import java.util.function.BiConsumer;

public class Ej7 {
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> operation = (a, b) -> System.out.println(a * b);
        operation.accept(-9, 7);
    }
}
