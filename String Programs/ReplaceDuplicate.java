/*public class ReplaceDuplicate {
    public static void main(String[] args) {
        
        String s1 = "banana";
        String s2 = " ";

        while (s1.length() > 0) {
            char c = s1.charAt(0);
            s2 = s1.replace(c +" ", " ");
            if(s1.length()-s2.length()>1)
            {
                System.out.println(c);
            }
            s1 = s2;
        }
    }
}
*/
public class ReplaceDuplicate {
    public static void main(String[] args) {

        String s1 = "banana";

        while (s1.length() > 0) {
            char c = s1.charAt(0);

            // remove all occurrences of c
            String s2 = s1.replace(c + "", "");

            // if more than one character was removed, it's a duplicate
            if (s1.length() - s2.length() > 1) {
                System.out.println(c);
            }

            s1 = s2;
        }
    }
}

