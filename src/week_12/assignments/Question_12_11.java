package week_12.assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_12_11 {
    public static void main(String[] args) {

        if (args.length > 2) {
            System.out.println("Sorry wrong input !\n" +
                    "You must enter :java Question_12_11 strToRemove fileName");
            System.exit(1);
        }
        String strToRemove = args[0];
        String fileName = args[1];
        //Firstly I read the file and remove str and return it as a list
        ArrayList<String> newText = changeFile(fileName, strToRemove);


        //And I write the new text from string list that
        // I took from changeFile() method, and write it to our file
        writeFile(newText, fileName);

    }


    public static ArrayList<String> changeFile
            (String fileName, String strToRemove) {
        ArrayList<String> newText = new ArrayList<>();
        File file = new File(fileName);
        if (!file.exists()) {
            System.out.println("File " + fileName + " does not exist !");
            System.exit(2);
        }

        try {
            Scanner input = new Scanner(file);


            while (input.hasNext()) {
                String line = input.nextLine();
                line = line.replaceAll(strToRemove, "");
                newText.add(line);
            }
            input.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File not found to read");
        }
        return newText;
    }

    public static void writeFile
            (ArrayList<String> newText, String fileName) {
        File file = new File(fileName);
        if (!file.exists()) {
            System.out.println("File " + fileName + " does not exist !");
            System.exit(3);
        }
        try {
            PrintWriter output = new PrintWriter(file);
            for (int i = 0; i < newText.size(); i++) {
                output.println(newText.get(i));
            }

            output.close();

        } catch (IOException ex) {
            System.out.println("Problem occurred to write file");
        }
    }
}
