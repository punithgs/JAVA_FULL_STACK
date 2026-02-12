//Write in data using BufferWritter

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataInBuffer {
    public static void main(String[] args)  throws IOException{

        FileWriter f = new FileWriter("/Users/punithgs/Documents/JAVA_FULLSTACK/CORE_JAVA/File Handling/Hello.java",true);
        BufferedWriter bf = new BufferedWriter(f);
        bf.write("Q_spiders");
        //bf.write("Q_spiders");
        //bf.write("Q_spiders");
        //bf.write("Q_spiders");
        //bf.write("Q_spiders");
        bf.close();
    }
}

        

