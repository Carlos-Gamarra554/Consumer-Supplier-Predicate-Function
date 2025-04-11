package Ejercicios;

import java.time.LocalDate;
import java.util.function.Consumer;

public class Ej11 {
    public static void main(String[] args) {
        Consumer<LocalDate> consumer = System.out::println;
        consumer.accept(LocalDate.now());
    }
}
