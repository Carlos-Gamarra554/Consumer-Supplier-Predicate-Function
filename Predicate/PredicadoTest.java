import java.util.function.Predicate;

public class PredicadoTest implements Predicate<Integer> {
    @Override
    public boolean test(Integer integer) {
        return integer > 10;
    }
}
