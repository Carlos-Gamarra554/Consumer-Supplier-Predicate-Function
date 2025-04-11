package Ejercicios;

import java.util.function.Consumer;

public class Ej1 {
    public static void main(String[] args) {
        Consumer<String> consumer = System.out::println;
        consumer.accept("Estoy en clase de programación");
    }
}
