public class demo1 {
    public static void main(String[] args) {
        
        int[] a = { 2,4,1,45,57,98};
        System.out.println(Search(a,12,0,a.length));
    }

    static int Search (int[]a, int key, int start, int end)
    {
        if(start > end)
            return -1;

        int mid = (start + end)/2;
        if(key == a[mid])
            return mid;
        else if (key < a[mid])
        return Search(a, key, start, mid - 1);
        else 
            return Search(a, key, mid+1, end);

    }
    
}
