package Tarea6_Function;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Ej6 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Double> potencia = Math::pow;
        Consumer<String> printPotencia = System.out::println;

        printPotencia.accept("Resultado de la potencia: " + potencia.apply(8,7).toString());
    }
}
