import java.io.File;
import java.io.IOException;

public class Filehandling {
    public static void main(String[] args)  throws IOException{

        File f = new File("/Users/punithgs/Documents/JAVA_FULLSTACK/CORE_JAVA/File Handling");

        System.out.println(f.mkdir());
        System.out.println(f.createNewFile());
        System.out.println(f.canRead());
        System.out.println(f.canWrite());
        System.out.println(f.canExecute());
        System.out.println(f.getAbsolutePath());
        
    }
    
}
