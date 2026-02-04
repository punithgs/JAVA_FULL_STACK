import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountIndianMobileNumbers {
    public static void main(String[] args) throws IOException {

        FileReader f = new FileReader("/Users/punithgs/Documents/JAVA_FULLSTACK/CORE_JAVA/File Handling/Hello.txt");
        BufferedReader bf = new BufferedReader(f);

        String line;
        int count = 0;

        // Indian mobile number regex
        Pattern pattern = Pattern.compile("\\b[6-9][0-9]{9}\\b");

        while ((line = bf.readLine()) != null) {

            Matcher matcher = pattern.matcher(line);

            while (matcher.find()) {
                count++;
            }
        }

        bf.close();

        System.out.println("Total Indian mobile numbers found: " + count);
    }
}
