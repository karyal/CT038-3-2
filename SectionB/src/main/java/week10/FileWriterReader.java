
package week10;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class FileWriterReader {
    public static void main(String []args){
        try{
            File file=new File("data1.txt");
            /*
            FileWriter fw = new FileWriter(file);
            fw.write("Hello from LBEF Campus");
            fw.close();
            System.out.println("Write contents on file successfully");
            */
            
            FileReader fr = new FileReader(file);
            int code = fr.read();
            while(code!=-1){
                System.out.println((char)code);
                code = fr.read();
                
            }
            fr.close();
        }
        catch(IOException ioe){
            System.out.print("Error : "+ioe.getMessage());
        }
    }
}
