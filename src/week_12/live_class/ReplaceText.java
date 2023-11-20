package week_12.live_class;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReplaceText {
    public static void main(String[] args) throws FileNotFoundException {


        if (args.length != 4) {
            System.out.println("Wrong input : SourceFile TargetFile oldText newText");
            System.exit(1);
        }
        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("Source file is not exist!");
            System.exit(2);
        }
        File targetFile = new File(args[1]);
        if (!targetFile.exists()) {
            System.out.println("Target file is not exist!");
            System.exit(3);
        }
        if (args[2].length() == 0 && args[3].length() == 0) {
            System.out.println("You must enter sth to replace!");
            System.exit(4);
        }
        try (
                Scanner input = new Scanner(sourceFile);
                PrintWriter output = new PrintWriter(targetFile);
        ) {
            while (input.hasNext()) {

                String line = input.nextLine();
                line = line.replaceAll(args[2], args[3]);
                output.println(line);
            }
        }



    }
}
