package Tarea6_Function;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Ej5 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> suma = Integer::sum;
        Consumer<String> printSuma = System.out::println;
        printSuma.accept("Resultado de la suma: " + suma.apply(8,7).toString());
    }
}
