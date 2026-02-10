// Writting a data into file using File Writter.?
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class  WriteData{
    public static void main(String[] args)  throws IOException{

        File file = new File("/Users/punithgs/Documents/JAVA_FULLSTACK/CORE_JAVA/File Handling/a.txt");
        FileWriter f = new FileWriter(file);

        if(file.canWrite())
        {
            f.write("j_spiders\n");
            f.write("py_spiders\n");
            f.write("q_spiders\n");
            f.write("j_spiders\n");
            f.write("pro_spiders\n");
        }
        else
            System.out.println("can not Write");
        f.close();

        
    }
    
}

