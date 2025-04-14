package Tarea4_Ejercicios;

import java.util.List;
import java.util.function.Predicate;

public class Ej8y9 {
    public static void main(String[] args) {
        List <String> lista = List.of("Carlos", "Gerardo", "Lucio", "Anatema", "Velo", "Débora");

        Predicate<String> longitud5oEmpzPorA = s -> s.length() == 5 || s.startsWith("A");
        Predicate<String> noEmpiezaPorP = s -> !s.startsWith("P");

        System.out.println("Nombres con longitud 5 o que empiecen por A de la lista: ");
        lista.stream().filter(longitud5oEmpzPorA).forEach(System.out::println);
        System.out.println("-------------------------------------------");

        System.out.println("Cantidad de nombres que no empiezan por P de la lista: ");
        System.out.println(lista.stream().filter(noEmpiezaPorP).count());
    }
}
