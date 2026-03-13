import java.util.Arrays;
import java.util.List;

public class Stream5 {
    public static void main(String[] args) {
        
        List<String> l = Arrays.asList("Yakoob","Amar","Chandu","Lilly","Sita","Ravana");
        List<String> list = l.stream().map(i->i.toLowerCase()).filter(i->!i.contains("y")).sorted().toList();
        System.out.println(list);
    }
}
