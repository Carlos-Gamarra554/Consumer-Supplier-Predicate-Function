package Tarea4_Ejercicios;

import java.util.List;
import java.util.function.Predicate;

public class Ej6y7 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(12, 29, 30, 42, 25, 6, 7, 58, 59, 22);

        Predicate<Integer> entre25y30 = x -> x >= 25 && x <= 30;
        Predicate<Integer> igualA22 = x -> x == 22;

        System.out.println("Números entre 25 y 30 de la lista: ");
        numeros.stream().filter(entre25y30).forEach(System.out::println);
        System.out.println("-------------------------------------------");

        System.out.println("Cantidad de números igual a 22 de la lista: ");
        System.out.println(numeros.stream().filter(igualA22).count());
    }
}
