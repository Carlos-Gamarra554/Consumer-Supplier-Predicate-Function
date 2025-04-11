package Ejercicios;

import java.util.function.BiConsumer;

public class Ej8 {
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> sumar = (a, b) -> System.out.println(a + b);
        BiConsumer<Integer, Integer> restar = (a, b) -> System.out.println(a - b);
        BiConsumer<Integer, Integer> dividir = (a, b) -> System.out.println(a / b);

        sumar.accept(-9, 7);
        restar.accept(-9, 7);
        dividir.accept(-9, 7);
    }
}
