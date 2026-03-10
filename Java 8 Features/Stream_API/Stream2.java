import java.util.Arrays;
import java.util.List;

public class Stream2 {
    public static void main(String[] args) {
        
        List<Integer> l = Arrays.asList(1,2,3,4,5,6,7,8,9);
        Long count = l.stream().filter(i->i%2==0).count();
        System.out.println(count);

List<Integer>list = l.stream().map(i->i*i).toList();
System.out.println(list);
    }
}
/*
4
[1, 4, 9, 16, 25, 36, 49, 64, 81]

in this program we are using stream filter and stream map
*/
