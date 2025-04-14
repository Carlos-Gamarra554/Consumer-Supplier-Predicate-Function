package Tarea4_Ejercicios;

import java.util.function.BiPredicate;

public class Ej5 {
    public static void main(String[] args) {
        BiPredicate<String, String> sonIguales = String::equalsIgnoreCase;

        System.out.println(sonIguales.test("Hola", "hoLA"));
        System.out.println(sonIguales.test("Carlos", "Paula"));
    }
}
