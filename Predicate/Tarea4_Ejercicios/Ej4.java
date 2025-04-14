package Tarea4_Ejercicios;

import java.util.function.Predicate;

public class Ej4 {
    public static void main(String[] args) {
        Predicate<Integer> diferenteDe100 = x -> x != 100;

        System.out.println(diferenteDe100.test(100));
        System.out.println(diferenteDe100.test(67));
    }
}
