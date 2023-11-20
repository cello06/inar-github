package week_12.live_class;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteData {
    public static void main(String[] args) throws IOException {
        File file = new File("scores.txt");
        if (file.exists()) {
            System.out.println("File already exist");
            System.exit(1);
        }
        PrintWriter output = new PrintWriter(file);
        output.print("Celalettin Harzemsah Akturk ");
        output.println(45);
        output.print("Tarık Mustafa Yasar ");
        output.println(95);
        output.close();
    }
}
