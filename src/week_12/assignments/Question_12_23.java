package week_12.assignments;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Question_12_23 {
    public static void main(String[] args) {
        String path = "C:\\Users\\Celallettin\\workspace\\inar-java\\src\\week_12\\assignments\\classes\\Salary.txt";
        File file = new File(path);
        try {
            PrintWriter output = new PrintWriter(file);
            for (int i = 1; i <= 1000; i++) {
                String firstName = "FirstName" + i;
                String lastName = "LastName" + i;
                String rank = getRandomRank();
                String salary = getRandomSalary(rank);

                output.print(firstName + " ");
                output.print(lastName + " ");
                output.print(rank + " ");
                output.println(salary);
            }
            output.close();
        } catch (IOException ex) {
            System.out.println("Problem occurred in I/O system!");
        }
    }

    public static String getRandomRank() {
        String[] ranks = {"assistant", "associate", "full"};
        int randomIndex = (int) (Math.random() * ranks.length);
        return ranks[randomIndex];
    }

    public static String getRandomSalary(String rank) {
        double salary = 0;
        switch (rank) {
            case "assistant":
                salary = Math.random() * 30_000 + 50_000;
                break;
            case "associate":
                salary = Math.random() * 50_000 + 60_000;
                break;
            case "full":
                salary = Math.random() * 55_000 + 75_000;
                break;
            default:
                System.out.println("Wrong rank!");
                System.exit(1);

        }
        return String.format("%.2f", salary);
    }
}
