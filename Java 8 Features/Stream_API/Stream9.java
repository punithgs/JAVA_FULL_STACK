import java.util.Arrays;
import java.util.List;

public class Stream9 {
    public static void main(String[] args) {
        
        String s = "java is very very easy java";
        String[] split = s.split(" ");
        List<String>aList = Arrays.asList(split);
        aList.stream().distinct().forEach(i-> System.out.print(i+" "));
    }
    
}

// Remove Duplicate words in string