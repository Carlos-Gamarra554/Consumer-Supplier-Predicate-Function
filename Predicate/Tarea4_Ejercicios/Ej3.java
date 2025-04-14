package Tarea4_Ejercicios;

import java.util.function.Predicate;

public class Ej3 {
    public static void main(String[] args) {
        Predicate<Integer> mayor100oMenor50 = x -> x > 100 || x < 50;

        System.out.println(mayor100oMenor50.test(10));
        System.out.println(mayor100oMenor50.test(67));
    }
}
