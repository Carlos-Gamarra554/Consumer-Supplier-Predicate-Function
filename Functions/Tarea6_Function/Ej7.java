package Tarea6_Function;

import java.util.function.Function;

public class Ej7 {
    public static void main(String[] args) {
        Function<Double, String> numero = x -> "Resultado: " + x;
        System.out.println(numero.apply(2.5));
    }
}
