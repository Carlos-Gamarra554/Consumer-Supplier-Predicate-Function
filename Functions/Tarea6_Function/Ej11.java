package Tarea6_Function;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Ej11 {
    public static void main(String[] args) {
        List<String> lista = Arrays.asList("Arrays", "Bucles", "Condicionales", "Lambdas");

        BiFunction<String, Integer, String> imprimirConCondicion = (x, y) -> {
            if (x.length() > y) {
                return x;
            }
            return null;
        };
        Consumer<String> imprimir = System.out::println;

        imprimir.accept("Palabras que cumplen la condición: ");
        for (String l : lista) {
            if (imprimirConCondicion.apply(l,6) != null) {
                imprimir.accept(l);
            }
        }
    }
}
