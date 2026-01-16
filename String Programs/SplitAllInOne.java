public class SplitAllInOne {
    public static void main(String[] args) {

        // Split by space
        String sentence = "Java is very easy";
        String[] words = sentence.split(" ");
        System.out.println("Split by space:");
        for (String w : words) {
            System.out.println(w);
        }

        System.out.println("------------------");

        // Split by comma
        String fruitsStr = "Apple,Banana,Orange";
        String[] fruits = fruitsStr.split(",");
        System.out.println("Split by comma:");
        for (String f : fruits) {
            System.out.println(f);
        }

        System.out.println("------------------");

        // Split by dot
        String s = "192.168.1.1";
        String[] n = s.split("\\.");
        System.out.println("Split by dot:");
        for (String p : n) {
            System.out.println(p);
        }

        System.out.println("------------------");

        //  Split each character
        String name = "JAVA";
        String[] letters = name.split("");
        System.out.println("Split each character:");
        for (String ch : letters) {
            System.out.println(ch);
        }

        System.out.println("------------------");

        //  Split by a letter
        String fruit = "banana";
        String[] parts = fruit.split("a");
        System.out.println("Split by letter 'a':");
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
