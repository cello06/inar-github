package week_12.assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Question_12_26 {
    public static void main(String[] args) {
        if (args.length != 1 && args[0].charAt(0) != '*') {
            System.out.println("Wrong input!\n" +
                    "Usage : java Question_12_26.java *");
            System.exit(1);
        }
        String path = "C:\\Users\\Celallettin\\workspace\\cello_java\\my_own\\my_own_studies\\src\\week_01";
        File file = new File(path);
        File[] files = file.listFiles();

        for (File f : files) {
            try {
                System.out.println(f.getName());
                StringBuilder page = new StringBuilder();
                Scanner input = new Scanner(f);
                while (input.hasNext()) {
                    String line = input.nextLine();
                    if (line.contains("Question")) {
                        line = lineChange(line);
                    }
                    page.append(line).append("\n");
                }
                PrintWriter output = new PrintWriter(f);
                output.print(page.toString());
                output.close();
            } catch (FileNotFoundException ex) {
                System.out.println("File not found !");
            }
        }
    }

    public static String lineChange(String line) {
        StringBuilder sb = new StringBuilder(line);
        int startIndex = 0;
        startIndex = line.indexOf("Question", startIndex);
        while (startIndex >= 0 && startIndex+"Question".length() <= sb.length()) {
            int endIndex = line.indexOf("Question",startIndex + 1);
            if(endIndex == -1){
                endIndex = sb.length();
            }
            for (int i = startIndex + "Question".length(); i < endIndex; i++) {
                if (i != 0 && i != sb.length() - 1 &&
                        Character.isDigit(sb.charAt(i))
                        && !Character.isDigit(sb.charAt(i + 1))
                        && !Character.isDigit(sb.charAt(i - 1))) {
                    sb.insert(i, "0");
                    endIndex = sb.length();
                }
                if(i == sb.length()-1 && Character.isDigit(sb.charAt(i))
                        && !Character.isDigit(sb.charAt(i-1))){
                    sb.insert(i,"0");
                }
            }
            startIndex = line.indexOf("Question",startIndex+1);
        }
        return sb.toString();
    }
}

