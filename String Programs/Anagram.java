public class Anagram {
    public static void main(String[] args) {
        System.out.println(anagram("silent", "listen"));
    }

    static boolean anagram(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        while (s1.length() > 0) {
            char c = s1.charAt(0);

            // if character not found in s2
            if (!s2.contains(c + "")) {
                return false;
            }

            // remove all occurrences of c from both strings
            s1 = s1.replace(c + "", "");
            s2 = s2.replace(c + "", "");
        }

        return true;
    }
}
