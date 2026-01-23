public class LinearSearch {
    public static void main(String[] args) {
        
        int[] a = {4,8,1,2,5,9};
        System.out.println(search(a, 4 ));
        System.out.println(search(a, 6));
    }
    static int search (int[]a, int key)
    {
        for (int i=0; i<a.length; i++)
        {
            if(a[i]==key)
                return i;
        }
        return -1;   
    }   
}



