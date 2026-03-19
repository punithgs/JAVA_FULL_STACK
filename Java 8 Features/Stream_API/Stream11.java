 import java.util.stream.Collectors;

public class Stream11 {
    public static void main(String[] args) {

        String s = "javaisveryeasy";

        String result = s.chars()                // convert to IntStream
                .mapToObj(c -> (char) c)         // int → char
                .distinct()                      // remove duplicates
                .map(String::valueOf)            // char → String
                .collect(Collectors.joining());  // join characters

        System.out.println(result);
    }
}

