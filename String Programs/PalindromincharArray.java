public class PalindromincharArray {
    public static void main(String[] args) {
        
        System.out.println(ispallindrome("malayalam"));
        System.out.println(ispallindrome("madm"));
    }
    static boolean ispallindrome(String s)
    {
        char[] a = s.toCharArray();
        int i = 0, j = a.length-1;
        while (i<j) {
            if(a[i] != a[j]) return false;
            i++;
            j--;
        }
        return true;
    }
}
