import java.util.function.Predicate;

public class Predicate1 {
    public static void main(String[] args) {
        
        Predicate<Integer> p = i -> i % 2 == 0;
        System.out.println(p.test(6));
        System.out.println(p.test(5));
    }
}

// predicate is a interface 
// boolean is return type 
// test is method (  test(<t>);  )
