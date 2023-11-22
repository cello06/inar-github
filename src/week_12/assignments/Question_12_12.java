package week_12.assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_12_12 {
    public static void main(String[] args) {


        String fileName = args[0];
        String linesOfClass = convertClass(fileName);
        writeNewClass(linesOfClass, fileName);

    }

    public static String convertClass(String fileName) {
        String s = "";
        File file = new File(fileName);
        if (!file.exists()) {
            System.out.println("There is no this kind of file to read!");
            System.exit(1);
        }
        try {
            Scanner input = new Scanner(file);

            while (input.hasNext()) {
               s += input.nextLine() + "\n";
            }
            s = s.replaceAll("\\s*\\{"," {");
            input.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File not found!");
        }
        return s;
    }

    public static void writeNewClass
            (String linesOfClass, String fileName) {
        File file = new File(fileName);
        if (!file.exists()) {
            System.out.println("There is no this kind of file to write!");
            System.exit(2);
        }
        try {
            PrintWriter output = new PrintWriter(fileName);

            output.println(linesOfClass);

            output.close();
        } catch (IOException ex) {
            System.out.println("I/O problem occurred!");
        }
    }


}
