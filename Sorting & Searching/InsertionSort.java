import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        
        int[]a = {4,8,5,1,2,6,9};
        System.out.println(Arrays.toString(a));
        sort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void sort (int[]a)
    {
        for (int i = 1; i<a.length; i++)
        {
            int key = a[i];
            int j = i - 1;

            while (j >= 0 && a[j]>key)
            {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;
        }
    }
}
