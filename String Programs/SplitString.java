class SplitString {
    public static void main(String[] args) {
        /*String s = "Java is fun";
        String[] a = s.split(" ");
        for (String str : a)
            System.out.println(str);
    }
}*/

// reverse string with slipt

  String s = "Java is fun";
        String[] a = s.split(" ");
        String s1 = " ";
        for (int i = a.length -1; i >= 0; i--)
        {
            s1 += a[i];
            if(i>0) s1 += " ";

        }
        System.out.println(s1);

    }}
        
      
