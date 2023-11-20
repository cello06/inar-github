package week_12.live_class;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadData {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("scores.txt");
        Scanner input = new Scanner(file);
        while(input.hasNext()){
            System.out.println("First Name : "+input.next());
            System.out.println("Middle Name : "+input.next());
            System.out.println("Last Name : "+input.next());
            System.out.println("Score : "+input.next());
            System.out.println("---------------------\n");
        }
        input.close();
    }
}
