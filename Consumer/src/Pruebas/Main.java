package Pruebas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        System.out.println("----------Lista de nombres-----------");
        nombres.add("Óscar");
        nombres.add("Juan");
        nombres.add("Carlos");
        nombres.add("Mike");
        nombres.forEach(System.out::println);


        System.out.println("-------Primera letra mayúscula-------");
        Consumer<String> printer = message -> {
            message = message.toLowerCase();
            String substring = message.substring(0,1).toUpperCase();
            message = substring + message.substring(1);
            System.out.println(message);
        };
        printer.accept("hola, Esto es un Texto de prUEba.");

        BiConsumer<Integer,String> bimap = (n, s) -> System.out.println(n + " " + s);
        bimap.accept(10,"diez");

        Map<Integer,String> mapa = new HashMap<>();
        mapa.put(1,"uno");
        mapa.put(2,"dos");
        mapa.put(3,"tres");
        mapa.forEach((k,v)->System.out.println("Clave: " + k + ", Valor: " + v));
    }
}