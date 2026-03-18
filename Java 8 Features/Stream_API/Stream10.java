import java.util.Arrays;

public class Stream10 {
    public static void main(String[] args) {
        
        int[] a = {2,2,1,3,1,3};
        int[] array = Arrays.stream(a).distinct().toArray();
        System.out.println(Arrays.toString(array));
    } 
}

// Remove duplicate elements in the array(numbers)