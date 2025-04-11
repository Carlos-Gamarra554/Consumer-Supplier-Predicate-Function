package Ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Ej3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Palabra");
        list.add("Carlos");
        list.add("Programación");
        list.add("Sentencia");
        list.add("Lambda");
        list.add("Lista");
        list.add("Severo Ochoa");
        list.add("Elche");
        list.add("Ordenador");
        list.add("Portátil");

        Consumer<List> listConsumer = lista -> {
            for (String o : list) {
                String lastLetter = o.substring(o.length() - 1);
                System.out.println(lastLetter);
            }
        };
        listConsumer.accept(list);
    }
}
