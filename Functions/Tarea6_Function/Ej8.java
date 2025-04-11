package Tarea6_Function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Ej8 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Double> potencia = Math::pow;
        Function<Double, String> numero = x -> "Resultado: " + x;

        System.out.println(numero.apply(potencia.apply(2,4)));
    }
}
