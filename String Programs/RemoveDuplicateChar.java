public class RemoveDuplicateChar {
    public static void main(String[] args) {

        String str = "banana";
        String result = "";

        //int i = 0;
        //while (i < str.length()) {
        for(int i = 0; i <str.length(); i++) 
        { 
          char ch = str.charAt(i);

            if (result.indexOf(ch) == -1) {
                result +=  ch;
            }
            //i++;
        }

        System.out.println(result);
    }
}
