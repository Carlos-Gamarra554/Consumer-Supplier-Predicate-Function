package Tarea6_Function;

import java.util.function.Consumer;
import java.util.function.Function;

public class Ej1 {
    public static void main(String[] args) {
        Function<String, Integer> extraerLongitud = String::length;
        Consumer<String> nombre = System.out::println;

        nombre.accept("Longitud: " + extraerLongitud.apply("Programación"));
    }
}