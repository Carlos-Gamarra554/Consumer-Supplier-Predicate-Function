package Tarea6_Function;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Ej12 {
    public static void main(String[] args) {
        List<String> lista = Arrays.asList("Arrays", "Bucles", "Condicionales", "Consumer");

        BiFunction<String, String, String> empiezaPor  = (a, b) -> {
            if (a.charAt(0) == b.charAt(0)) {
                return a;
            }
            return null;
        };

        Consumer<String> consumer = System.out::println;

        for (String x : lista) {
            if (empiezaPor.apply(x, "Carlos") != null) {
                consumer.accept(x);
            }
        }
    }
}
