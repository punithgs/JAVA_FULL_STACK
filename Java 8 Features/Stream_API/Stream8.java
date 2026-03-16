import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream8 { // Occarnce of Character
    public static void main(String[] args) {
        
        String s = "javadev";
        Map<Character,Long> collect = s.chars().mapToObj(i ->(char) i).collect
        (Collectors.groupingBy(i-> i,()-> new LinkedHashMap<Character,Long>(),Collectors.counting()));
        collect.forEach((i,j) -> System.out.println(i + "=" + j));
    }  
}
