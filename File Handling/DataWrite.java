// Data Writter using Fileoutputstream
import java.io.FileOutputStream;
import java.io.IOException;

public class  DataWrite{
    public static void main(String[] args)  throws IOException{

        FileOutputStream f  = new FileOutputStream("/Users/punithgs/Documents/JAVA_FULLSTACK/CORE_JAVA/File Handling/a.txt");
        // f.write("Ram"); CTE

        String s = "RamSita";
        byte[] bytes = s.getBytes();
        f.write(bytes);
        f.close();    
    }  
}

