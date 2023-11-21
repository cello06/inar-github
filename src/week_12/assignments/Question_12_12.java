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
        ArrayList<String> linesOfClass = convertClass(fileName);
        writeNewClass(linesOfClass, fileName);

    }

    public static ArrayList<String> convertClass(String fileName) {
        ArrayList<String> linesOfClass = new ArrayList<>();
        File file = new File(fileName);
        if (!file.exists()) {
            System.out.println("There is no this kind of file to read!");
            System.exit(1);
        }
        try {
            Scanner input = new Scanner(file);
            while (input.hasNext()) {
                String currentLine = input.nextLine();
                String checkLine = currentLine.trim();

                if (checkLine.startsWith("public class")) {
                    linesOfClass.add(currentLine.trim() + " {");
                } else if (checkLine.equals("}")) {
                    linesOfClass.add(currentLine);
                } else if (checkLine.startsWith("public static void main")) {
                    linesOfClass.add(currentLine + " {");

                } else if (!checkLine.equals("{")) {
                    linesOfClass.add(currentLine);
                }
            }
            input.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File not found!");
        }
        return linesOfClass;
    }

    public static void writeNewClass
            (ArrayList<String> linesOfClass, String fileName) {
        File file = new File(fileName);
        if (!file.exists()) {
            System.out.println("There is no this kind of file to write!");
            System.exit(2);
        }
        try {
            PrintWriter output = new PrintWriter(fileName);
            for (int i = 0; i < linesOfClass.size(); i++) {
                output.println(linesOfClass.get(i));
            }
            output.close();
        } catch (IOException ex) {
            System.out.println("I/O problem occurred!");
        }
    }


}
