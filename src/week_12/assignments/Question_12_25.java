package week_12.assignments;

import java.io.File;
import java.util.Scanner;

public class Question_12_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter directory name : ");
        String directoryPath = "C:\\Users\\Celallettin\\workspace\\inar-java\\src\\week_12\\assignments\\classes"
                + input.nextLine();

        File directory = new File(directoryPath);

        if (!directory.exists()) {
            boolean isCreated = directory.mkdir();
            if (isCreated) {
                System.out.println("Directory created successfully");
            } else {
                System.out.println("Directory couldn't be created");
            }
        } else {
            System.out.println("Directory already exists");
        }
    }
}
