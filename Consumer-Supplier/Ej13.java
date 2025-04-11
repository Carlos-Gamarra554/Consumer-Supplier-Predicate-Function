package Ejercicios;

import java.util.function.Consumer;

public class Ej13 {
    public static void main(String[] args) {
        Programador x = new Programador("Carlos");
        Consumer<Programador> consumer = y -> System.out.println("Programador: " + y.getNombre());
        consumer.accept(x);
    }
}
