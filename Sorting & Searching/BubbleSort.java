/*import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        
        int[] a = {10,5,12,6,7,1,2,8};
        System.out.println(Arrays.toString(a));
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int[]a)
    {
        for (int i=0; i<a.length-1; i++)
        {
            for (int j =0; j<a.length-1-i; j++)
            {
                if (a[j]>a[j+1])
                {
                    int temp = a[j];
                    a[j] = a [j+1];
                    a[j+1] = temp;
                }
            }
        } 
    }
}
*/
import java.util.Arrays;

public class BubbleSort{
public static void main(String[] args) {
    
    int[]a = {1,3,4,5,78,9};

    System.out.println(Arrays.toString(a));
    sort(a);
    System.out.println(Arrays.toString(a));
}

public static void sort (int[]a)
{
    for (int i = 0 ; i<a.length-1; i++)
{
    for (int j = 0 ; j<a.length-1; j++) 
    {
        if (a[j] > a[j+1])
        {
            int temp = a[j];
            a[j] = a[j+1];
            a[j+1] = temp;
        }
    }
}
} 
}
