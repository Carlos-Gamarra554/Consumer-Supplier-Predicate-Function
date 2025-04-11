package Ejercicios;

import java.util.LinkedHashMap;

public class Ej10 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> mapa = new LinkedHashMap<>();

        mapa.put(1, "Estocolmo");
        mapa.put(2, "Venecia");
        mapa.put(3, "Croacia");
        mapa.put(4, "Dinamarca");
        mapa.put(5, "España");

        mapa.forEach((clave, valor) -> System.out.println(clave + ": " + valor));
    }
}
