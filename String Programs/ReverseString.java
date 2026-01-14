 
public class ReverseString {
    public static void main(String[] args) {
        String s = "Java";
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        if(s.equals(rev))
        System.out.println("pallindrome" +rev);
    }
}

// Reverse String using char[] 

 /*public class ReverseString1 {
    public static void main(String[] args) {
        
        String s1 = " madam";
        char[] a = s1.toCharArray();
        int i = 0, j =a.length-1;
        while (i<j)
        {
            char temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }

        String s2 = new String(a);
        System.out.println(s2);
        
        if(s1.equals(s2))
        
        System.out.println("pallindrome");
        
    }
 } */
