import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        
        int[]a = {5,3,1,7,2,4,9,10,11,1};
        System.out.println(Arrays.toString(a));
        sort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void sort (int[] a)
    {
        if(a.length == 1)
            return;

        int[] left = new int[a.length/2];
        int[] right = new int [a.length-left.length];

        int i = 0;

        while (i<left.length) {
            left[i] = a[i];
            ++i;    
        }
        int j = 0;
        while (j<right.length) {
            right[j] = a[i];
            j++;
            i++;
        }
        sort(left);
        sort(right);
        Merge(left,right,a);
    }


    }
}
