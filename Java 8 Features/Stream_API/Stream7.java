import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.LinkedHashMap;

public class Stream7 {
    
    public static void main(String[] args) {
        
        String s = "Java is very very easy java";
        String[] split = s.split(" ");
        List<String> asList = Arrays.asList(split);
        Map<String,Long> collect = asList.stream().collect
        (Collectors.groupingBy(i->i,()-> new LinkedHashMap<String,Long>(),Collectors.counting()));
        collect.forEach((a,b) -> System.out.println(a + " = " + b));
    }
}
    
// Occurence of world in a string