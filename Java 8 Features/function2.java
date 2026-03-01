import java.util.function.Predicate;
import java.util.function.Function;

public class function2 {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 6};

        Predicate<Integer> p = i -> i % 2 == 0;
        Function<Integer, Integer> f = i -> i * i;

        for (int n : a) {
            if (p.test(n)) {
                System.out.println(f.apply(n));
            }
        }
    }
}

// In this Program we use Predicate and function interface 

// output is square of even numbers.
