package Ejercicios;

import java.time.LocalDate;

public class Programador {
    private String nombre;
    private Double salario;
    private LocalDate fechaInicio;

    public Programador(String nombre, Double salario, LocalDate fechaInicio) {
        this.nombre = nombre;
        this.salario = salario;
        this.fechaInicio = fechaInicio;
    }

    public Programador(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getSalario() {
        return salario;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }
}
