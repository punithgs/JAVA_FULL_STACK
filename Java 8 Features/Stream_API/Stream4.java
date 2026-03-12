
import java.util.Arrays;
import java.util.List;

public class Stream4 {
    public static void main(String[] args) {
        
        List<Integer> l = Arrays.asList(6,3,3,1,2,2,4,3,5,4);
        List<Integer>list = l.stream().distinct().sorted().toList();
        System.out.println(list);
    }
    
}


