import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        
        int[] a = {4,8,5,1,2,6,9};
        System.out.println(Arrays.toString(a));
        sort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void sort(int[]a)
    {
        for (int i = 0; i < a.length-1; i++)
        {
          int index = i;

          for (int j = i+1; j < a.length; j++)
          {
            if (a[j] < a [index])
            {
                index = j;
            }
          }
          if (i != index)
          {
            int temp = a[index];
            a[index] = a[i];
            a[i] = temp;
          }
        }
    }
}
