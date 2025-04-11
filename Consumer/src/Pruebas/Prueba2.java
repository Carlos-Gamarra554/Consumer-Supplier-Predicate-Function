package Pruebas;

import java.util.Random;
import java.util.function.Supplier;

public class Prueba2 {
    public static void main(String[] args) {
        Supplier<Double> random = Math::random;
        double num = random.get();

        System.out.println(num);
        System.out.println(random.get());
        System.out.println("-----------------------------");

        Supplier<Integer> random2 =() -> new Random().nextInt(200+1);
        System.out.println(random2.get());
        System.out.println(random2.get());
        System.out.println("-----------------------------");

        Supplier<Ciudad> city =() -> new Ciudad("Elche","Alicante");
    }
}
