package week_12.assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_12_31 {
    public static void main(String[] args) {
        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s\n",
                "Year", "Rank 1", "Rank 2", "Rank 3", "Rank 4", "Rank 5", "Rank 1", "Rank 2", "Rank 3", "Rank 4", "Rank 5");
        System.out.println("----------------------------------------------------------------------------------------------------------");
        for (int i = 2010; i >= 2001; i--) {
            String path = "C:\\Users\\Celallettin\\workspace\\inar-java\\src\\week_12\\assignments\\classes\\babynameranking" + i + ".txt";
            File file = new File(path);
            ArrayList<String> boys = new ArrayList<>();
            ArrayList<String> girls = new ArrayList<>();
            try {
                Scanner input = new Scanner(file);
                int countOfName = 0;
                do {
                    String line = input.nextLine();
                    String[] parts = line.split("\t");
                    boys.add(parts[1]);
                    girls.add(parts[3]);
                    countOfName++;
                } while (input.hasNext() && countOfName < 5);

                System.out.printf("%-10d%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s\n",
                        i, girls.get(0), girls.get(1), girls.get(2), girls.get(3), girls.get(4),
                        boys.get(0), boys.get(1), boys.get(2), boys.get(3), boys.get(4));

            } catch (FileNotFoundException ex) {
                System.out.println("File not found!");
            }
        }
    }
}
