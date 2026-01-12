public class Replace00_xx {
    public static void main(String[] args) {
        
        String s1 = "pool";
        String res = " ";
        for (int i = 0; i<s1.length(); i++)
        {
            if(s1.charAt(i) == 'o') // replace charactor
                res += "x";
            else
                res += s1.charAt(i);
        }
        System.out.println(res);
    }
    
}
