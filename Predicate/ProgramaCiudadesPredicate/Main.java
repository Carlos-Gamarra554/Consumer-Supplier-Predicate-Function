import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 1
        Predicate<Integer> mayorQue100 = a -> a > 100;
        System.out.println(mayorQue100.test(400));

        //Ejercicio 2
        Predicate<Integer> entre100y300 = a -> a >= 100 && a <= 300;
        System.out.println(entre100y300.test(120));

        //Ejercicio 3
        Predicate<Integer> mayorQue100menorQue50 = a -> a > 100 || a < 50;
        System.out.println(mayorQue100menorQue50.test(300));

        //Ejercicio 4
        Predicate<Integer> distintoDe100 = a -> a != 100;
        System.out.println(distintoDe100.test(100));

        //Ejercicio 5
        BiPredicate<String, String> textosIguales = String::equalsIgnoreCase;
        System.out.println(textosIguales.test("HOLA", "ola"));

        //Ejercicio 6
        System.out.println("-----------------------------------\n" +
                "Números entre 25 y 30 de la lista:");
        List<Integer> numeros = List.of(1, 22, 3, 4, 5, 26, 7, 8, 9, 10);
        Predicate<Integer> entre25y30 = a -> a >= 25 && a <= 30;
        numeros.stream().filter(entre25y30).forEach(System.out::println);

        //Ejercicio 7
        System.out.println("Números iguales a 22:");
        Predicate<Integer> igualA22 = a -> a == 22;
        numeros.stream().filter(igualA22).forEach(System.out::println);

        //Ejercicio 8
        System.out.println("Nombres que empiezan por A o que tienen 5 letras:");
        List<String> nombres = List.of("María", "Juan", "Pedro", "Carlos", "Germán", "Paula");
        Predicate<String> longitud5oempiezaPorA  = e -> e.length() == 5 || e.startsWith("A");
        nombres.stream().filter(longitud5oempiezaPorA).forEach(System.out::println);

        //Ejercicio 9
        System.out.println("Nombres que no empiezan por P:");
        Predicate<String> noEmpiezaP = e -> !e.startsWith("P");
        nombres.stream().filter(noEmpiezaP).forEach(System.out::println);

        //Ejercicio 10
        PredicadoTest pt = new PredicadoTest();
        int num = 12;

        System.out.println("¿El número " + num + " cumple la condición?: " + pt.test(num));
    }
}