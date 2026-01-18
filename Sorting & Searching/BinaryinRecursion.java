public class BinaryinRecursion {
    public static void main(String[] args) {
        
        int[] a = {2,4,6,7,8,10,11,13,15};
        System.out.println(search(a, 12,0,a.length-1));
    }
    static int search (int[]a, int key, int start, int end)
    {

        if(start > end)
            return-1;
        
            int mid = (start + end)/2;
            if(key == a[mid])
                return mid;
            else if (key < a[mid]) 
                return search(a, key, start, mid -1);
            else 
                return search(a, key, mid+1, end);
        }  
    }
