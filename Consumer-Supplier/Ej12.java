package Ejercicios;

import java.time.LocalDate;
import java.util.function.Consumer;

public class Ej12 {
    public static void main(String[] args) {
        Programador p1 = new Programador("Juan", 25000.00, LocalDate.now());
        Consumer<Programador> consumer = x -> System.out.println("Programador: " + x.getNombre() + ", salario: " + x.getSalario() + ", fecha inicio: " + x.getFechaInicio());
        consumer.accept(p1);
    }
}
