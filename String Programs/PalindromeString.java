public class PalindromeString {
    public static void main(String[] args) {
        String s = "madam";
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        if (s.equals(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}

// pallindrome Using char[]


/*public class pallindrome1
{
    public static void main(String[] args) {

        System.out.println(ispallindrome("madam"));
        System.out.println(ispallindrome("malayalam"));
    }
    static boolean ispallindrome(String s)
    {
        char[] a = s.toCharArray();

        int i = 0,  j = a.length-1;

        while (i < j)
        {
             if(a[i] != a[j])
                return false;
            i++;
            j--;
            
        }
        return true;
    }
}*/