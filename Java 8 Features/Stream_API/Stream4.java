/*
Remove the duplicate values in to the array using stream API
1) stream is used to convert the arrays into stream
2) distinct are used to remove the duplicate values
3) sorted are used to sort the given number in asending or sorted order
4) toList are used to covert the stream into number(output format)
5) output == [1, 2, 3, 4, 5, 6]
*/

import java.util.Arrays;
import java.util.List;

public class Stream4 {
    public static void main(String[] args) {
        
        List<Integer> l = Arrays.asList(6,3,3,1,2,2,4,3,5,4);
        List<Integer>list = l.stream().distinct().sorted().toList();
        System.out.println(list);
    }
    
}


