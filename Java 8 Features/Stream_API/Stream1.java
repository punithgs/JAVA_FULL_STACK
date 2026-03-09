import java.util.Arrays;
import java.util.List;

public class Stream1 {
    public static void main(String[] args) {
        
        List<Integer> l = Arrays.asList(1,2,3,4,5,6,7,8,9);
        Long count = l.stream().filter(i->i%2==0).count();
        System.out.println(count);
    }
    
}

// in this example we are finding even number in given array
// we are using stream API
// first step is we convert the arrays into stream using stream method(stream();)
// next using filter method and inside we pass predicate inteface function (" lamda expression")