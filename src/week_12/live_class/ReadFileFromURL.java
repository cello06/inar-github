package week_12.live_class;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ReadFileFromURL {
    public static void main(String[] args) {
        System.out.print("Enter a URL : ");
        try {
            URL url = new URL(new Scanner(System.in).next());

            Scanner input = new Scanner(url.openStream());
            int count = 0;
            while (input.hasNext()) {
                String line = input.nextLine();
                count += line.length();
            }
            System.out.println("The file size is " + count + " characters");
        } catch (MalformedURLException ex) {
            System.out.println("Invalid URL!");
        } catch (IOException ex) {
            System.out.println("File not found!");
        }

    }
}
