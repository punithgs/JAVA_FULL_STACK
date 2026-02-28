import java.util.function.Function;

public class Function1 {
    public static void main(String[] args) {
         Function <Integer,Integer> f = i -> i * i;
         System.out.println(f.apply(5)); // 25

         Function<String, Integer> fn = i -> i.length();
         System.out.println(fn.apply("java")); // 4
    } 
}

// function is a interface 
// apply method (.  apply();  )