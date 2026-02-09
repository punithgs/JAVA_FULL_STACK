import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCountUsingBuffer {
    public static void main(String[] args) throws IOException {

        FileReader f = new FileReader("/Users/punithgs/Documents/JAVA_FULLSTACK/CORE_JAVA/File Handling/Hello.txt");
        BufferedReader bf = new BufferedReader(f);

        String line;
        int wordCount = 0;

        while ((line = bf.readLine()) != null) {

            // Remove extra spaces and split by one or more spaces
            String[] words = line.trim().split("\\s+");

            // Handle empty lines
         

        bf.close();

        System.out.println("Total number of words: " + wordCount);
    }
}
