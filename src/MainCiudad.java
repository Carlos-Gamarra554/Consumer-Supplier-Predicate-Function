import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MainCiudad {
    public static void main(String[] args) {
        List<Ciudad> ciudades = new ArrayList<>();
        ciudades.add(new Ciudad("Elche", 100450));
        ciudades.add(new Ciudad("Alicante", 50000));
        ciudades.add(new Ciudad("Catral", 5000));
        ciudades.add(new Ciudad("Albatera", 2500));
        ciudades.add(new Ciudad("Seúl", 2000000));
        ciudades.add(new Ciudad("Taiwán", 500000));
        ciudades.add(new Ciudad("Tokio", 18000000));
        ciudades.add(new Ciudad("Pekín", 5000000));
        ciudades.add(new Ciudad("Roma", 2000000));
        ciudades.add(new Ciudad("Grecia", 5012303));

        Predicate<Ciudad> empiezaPorE = e -> e.getNombre().startsWith("E") && e.getNumHabitantes() > 100000;
        printCities(ciudades, empiezaPorE);
    }

    public static void printCities(List<Ciudad> ciudades, Predicate<Ciudad> empiezaPorE) {
        ciudades.stream()
                .filter(empiezaPorE)
                .forEach(ciudad -> System.out.println(ciudad.getNombre()));
    }
}
