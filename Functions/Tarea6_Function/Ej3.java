package Tarea6_Function;

import java.util.function.Consumer;
import java.util.function.Function;

public class Ej3 {
    public static void main(String[] args) {
        Function<String, Integer> extraerLongitud = String::length;
        int longitud = extraerLongitud.apply("Programación");

        Function<Integer, Integer> potencia = x -> (int) Math.pow(2, x);
        Consumer<String> printPow = System.out::println;
        printPow.accept("Potencia de 2: " + potencia.apply(longitud).toString());
    }
}
