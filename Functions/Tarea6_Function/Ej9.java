package Tarea6_Function;

import java.util.function.Consumer;

public class Ej9 {
    public static void main(String[] args) {
        potencia(2, 4);
    }

    public static void potencia(int a, int b) {
        Consumer<String> consumer = System.out::println;
        consumer.accept("Resultado: " + Math.pow(a, b));
    }
}
