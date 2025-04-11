package Ejercicios;

import java.util.function.Supplier;

public class Ej4 {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Java es un lenguaje de programación";
        System.out.println(supplier.get());
    }
}
