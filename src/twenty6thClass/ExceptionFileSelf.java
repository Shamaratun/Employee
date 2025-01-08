package twenty6thClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionFileSelf {
    public static void main(String[] args) {


    try {
        File meme = new File("test.txt");
        FileInputStream stream = new FileInputStream (meme);
    } catch (FileNotFoundException e) {
        System.out.println("FileNotFoundException = " + e.getMessage());
    }
     catch (IOException e) {
        System.out.println("IOException = " + e.getMessage());
    }
}
}
