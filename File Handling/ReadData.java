// Reading Data from the file using data Inputstream

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class ReadData {
    public static void main(String[] args)  throws IOException{

        File file = new File("/Users/punithgs/Documents/JAVA_FULLSTACK/CORE_JAVA/File Handling/Hello.java");
        FileInputStream f = new FileInputStream(file);

        FileWriter bf = new FileWriter("/Users/punithgs/Documents/JAVA_FULLSTACK/CORE_JAVA/File Handling/Hello.txt");

        if(file.canRead())
        {
            int n = f.read();
            while (n != -1) 
            {
                bf.write((char) n );
                n = f.read();
            }
        } else
            System.out.println("can not Read");
        f.close();
        bf.close();   
    }  
}
// tranforing data from onr file to another file
// in this hello.java to hello.txt 

