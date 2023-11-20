package week_12.live_class;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class WebCrawler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a URL : ");
        String stringURL = input.next();
        crawler(stringURL);
    }

    public static void crawler(String stringURL) {
        ArrayList<String> listOfPendingURLs = new ArrayList<>();
        ArrayList<String> listOfTraversedURLs = new ArrayList<>();

        listOfPendingURLs.add(stringURL);
        int count = 0;//First URL(main URL) will be zero..
        while (!listOfPendingURLs.isEmpty() &&
                listOfTraversedURLs.size() <= 100) {
            String startURL = listOfPendingURLs.remove(0);
            if (!listOfTraversedURLs.contains(startURL)) {
                listOfTraversedURLs.add(stringURL);
                System.out.println("Craw " + count + ") :" + startURL);
                count++;
                for (String s : getSubURLs(startURL)) {
                    if (!listOfTraversedURLs.contains(s)) {
                        listOfPendingURLs.add(s);
                    }
                }
            }
        }
    }

    public static ArrayList<String> getSubURLs(String startURL) {
        ArrayList<String> list = new ArrayList<>();
        try {
            URL url = new URL(startURL);
            Scanner input = new Scanner(url.openStream());
            int current = 0;
            while (input.hasNext()) {
                String line = input.nextLine();
                current = line.indexOf("http:", current);
                while (current > 0) {
                    int endIndex = line.indexOf("\"", current);
                    if (endIndex > 0) {
                        list.add(line.substring(current, endIndex));
                        current = line.indexOf("http:", endIndex);
                    } else {
                        current = -1;
                    }
                }
            }
        } catch (MalformedURLException ex) {
            System.out.println("Invalid URL!");
        } catch (IOException ex) {
            System.out.println("File not found");
        }
        return list;
    }
}
