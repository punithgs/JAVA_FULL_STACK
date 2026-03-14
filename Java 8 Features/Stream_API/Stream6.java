import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream6 {
    
    public static void main(String[] args) {
        
        List<String> l = Arrays.asList("java","is","easy","easy","easy");
        Map<String, Long> collect = l.stream().collect(Collectors.groupingBy
        (i->i,Collectors.counting()));
        collect.forEach((i,j) -> System.out.println( i + "=" + j));

    }
}
    
// occurence of words(elemnts)