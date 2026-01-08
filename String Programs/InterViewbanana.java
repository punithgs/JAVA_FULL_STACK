public class InterViewbanana {
    public static void main(String[] args) {
        
        String s = "banana";
        for (int i = 0; i < s.length()-1; i++)
        {
            for (int j = i+1; j < s.length(); j++)
            {
                if(ispallindrome(s,i,j))
                {
                    System.out.println(s.substring(i,j+1));
                }
            }
        }
    }
    static boolean ispallindrome(String s, int start, int end)
    {
        char[] a = s.toCharArray();
        int i = start, j = end;

        while (i<j) {
            if(a[i] != a[j])
                return false;
            i++;
            j--;
        }
    return true;
    }
}
