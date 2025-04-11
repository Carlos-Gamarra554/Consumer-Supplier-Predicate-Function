package Tarea6_Function;

import java.util.function.Consumer;
import java.util.function.Function;

public class Ej2 {
    public static void main(String[] args) {
        Function<Integer, Integer> potencia = x -> (int) Math.pow(2, x);
        Consumer<String> printPow = System.out::println;
        printPow.accept("Potencias de 2: " + potencia.apply(4).toString());
    }
}
