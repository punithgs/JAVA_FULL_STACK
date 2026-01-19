public class BinarySearch {
    public static void main(String[] args) {
        
        int[] a = {2,4,5,7,9,10,23,34};
        System.out.println(search(a, 10));
        System.out.println(search(a, 11));
    }
    static int search (int[]a, int key)
    {
        int start = 0 ; 
        int end = a.length-1;

        while(start <= end)
        {
            int mid = (start + end)/2;
            if(key == a[mid])
                return mid;
            else if (key < a[mid]) 
                end = mid - 1;
            else start = mid+1;
        }
        return-1;
    }

    
}
