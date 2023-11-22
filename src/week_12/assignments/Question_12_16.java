package week_12.assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Question_12_16 {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Wrong input !\n" +
                    "Usage : java Question_12_16.java fileName oldStr newStr");
            System.exit(1);
        }
        String oldString = args[1];
        String newString = args[2];

        String currentPath = "C:\\Users\\Celallettin\\workspace\\inar-java\\src\\week_12\\assignments\\classes\\";
        String filePath = currentPath + args[0];

        File file = new File(filePath);
        System.out.println(file.exists());

        try {
            String strOfFile = readFile(file);//First I read file
            strOfFile = strOfFile.replaceAll(oldString, newString);//Then replace it
            writeFile(strOfFile, file);//Then write it to the same file
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static String readFile(File file)
            throws FileNotFoundException {
        StringBuilder strOfFile = new StringBuilder();
        try {
            Scanner input = new Scanner(file);

            while (input.hasNext()) {
                String line = input.nextLine();
                strOfFile.append(line).append("\n");
            }
        } catch (FileNotFoundException ex) {
            throw new FileNotFoundException("File not found to read!(in readFile()!)");
        }
        return strOfFile.toString();
    }

    public static void writeFile(String strOfFile, File file)
            throws IOException {
        try {
            PrintWriter output = new PrintWriter(file);
            output.println(strOfFile);
            output.close();
        } catch (IOException ex) {
            throw new IOException("Problem occurred in writeFile method! \n" +
                    "It is about I/O System");
        }
    }
}
