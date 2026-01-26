import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {

        int[]a = {5,8,1,2,9,12,4,23,7};
        System.out.println(Arrays.toString(a));
        sort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
    public void sort(int[] a)
    {
        sort (a,0,a.length-1);
    }
    public static void sort (int[]a, int start, int end)


        while (i <= j) {
            while (a[i] < pivot) i++ ;
            while (a[j] > pivot) j-- ;
            if (i <= j)
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                    i++;
                    j--;
            }   
            }
            sort(a,start,j);
            sort(a,i,end); 
        }
    }
