package File;

import static File.file_read.*;
import static File.file_writer.*;

public class FileTester {
    public static void main(String[] args){

    write("./src/File/file.txt","Hello\nwelcome to vietnam\nwhere are you from\ni'm from Laos");
    Read("./src/File/file.txt");
    }
}
