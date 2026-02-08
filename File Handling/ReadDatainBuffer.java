// Read the Data using BufferReader

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadDatainBuffer {
    public static void main(String[] args)  throws IOException{

        FileReader f = new FileReader("/Users/punithgs/Documents/JAVA_FULLSTACK/CORE_JAVA/File Handling/Hello.java");
        BufferedReader bf = new BufferedReader(f);
        String s = bf.readLine();
        while ((s != null)) {
            System.out.println(s);
            s = bf.readLine();
        }
        bf.close();
    }
}
      
       