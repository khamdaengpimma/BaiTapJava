package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class file_read {
    public static void Read(String fileName){
        File file = new File(fileName);
        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()){
                String text = scan.nextLine();
                System.out.println(text);

            }
        } catch (FileNotFoundException e) {
            System.out.println("error");
        }
    }

}
