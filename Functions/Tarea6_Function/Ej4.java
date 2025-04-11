package Tarea6_Function;

import java.util.*;
import java.util.function.Function;

public class Ej4 {
    public static void main(String[] args) {
        List<String> lista = Arrays.asList("Python","Java","HTML","C++");
        Function<String, Integer> extraerLongitud = String::length;

        Map <String, Integer> mapaLenguajes = convertirListaEnMapa(lista, extraerLongitud);
        mapaLenguajes.forEach((x, y) -> System.out.println(x + ": " +y));
    }

    public static Map<String, Integer> convertirListaEnMapa(List<String> lista, Function<String, Integer> extraerLongitud) {
        Map<String, Integer> mapa = new HashMap<>();
        for (String s : lista) {
            mapa.put(s, extraerLongitud.apply(s));
        }
        return mapa;
    }
}
