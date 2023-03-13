package File;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;


public class file_writer {
    public static void write(String fileName,String s){
        File file = new File(fileName);
        PrintWriter out = null;
        try {
            out = new PrintWriter(file);
            out.println(s);
            out.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }


    }
//    public static void main(String[] args){
//        write("./src/File/file.txt","Hello \nWelcome to Vietnam");
//    }
}
