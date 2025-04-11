package Ejercicios;

import java.util.function.Consumer;

public class Ej5 {
    public static void main(String[] args) {
        Consumer<Double> randomNumber = System.out::println;
        System.out.println("Número decimal al azar:");
        randomNumber.accept(Math.random());
    }
}