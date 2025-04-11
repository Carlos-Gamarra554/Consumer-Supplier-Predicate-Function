package Ejercicios;

import java.time.LocalDate;
import java.util.function.Supplier;

public class Ej14 {
    public static void main(String[] args) {
        Supplier<Programador> crearProgramador = () -> new Programador("Carlos");
        Programador programador = fabricaProgramadores(crearProgramador);
        System.out.println("Programador creado:");
        System.out.println("Nombre: " + programador.getNombre() + ", salario: " + programador.getSalario() + ", fecha inicio: " + programador.getFechaInicio());
    }

    public static Programador fabricaProgramadores(Supplier<Programador> supplier) {
        Programador programador = supplier.get();
        if (programador.getSalario() != null) {
            return programador;
        }
        return new Programador(programador.getNombre(), 50000.00, LocalDate.now());
    }
}
