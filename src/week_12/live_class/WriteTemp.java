package week_12.live_class;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteTemp {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(System.getProperty("user.dir"));
        File temp = new File("C:\\Users\\Celallettin\\workspace\\inar-java\\" +
                "src\\week_12\\live_class\\temp.txt");
        PrintWriter output = new PrintWriter(temp);
        output.print("");
        output.close();
    }
}
