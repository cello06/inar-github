package week_12.assignments;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_12_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a URL :");
        String url = input.nextLine();
        System.out.print("Enter a word for searching :");
        String wordForSearch = input.nextLine();
        crawler(url, wordForSearch);
    }

    public static void crawler(String url, String wordForSearch) {
        boolean searchFinished;
        ArrayList<String> pendingURLs = new ArrayList<>();
        ArrayList<String> traversedURLs = new ArrayList<>();
        try {
            pendingURLs.add(url);
            while (!pendingURLs.isEmpty()) {
                String startURL = pendingURLs.remove(0);
                if (!traversedURLs.contains(startURL)) {
                    traversedURLs.add(startURL);
                    searchFinished = checkURLForWord(startURL, wordForSearch);

                    System.out.println("Craw : " + startURL);
                    if (searchFinished) {
                        System.out.println("The word has found!");
                        break;
                    } else {
                        System.out.println("There is not any url that contains word!");
                    }
                    for (String s : getSubURLs(startURL)) {
                        if (!traversedURLs.contains(s)) {
                            pendingURLs.add(s);
                        }
                    }
                }
            }
        } catch (MalformedURLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static boolean checkURLForWord
            (String stringURL, String wordForSearch)
            throws MalformedURLException {
        try {

            URL url = new URL(stringURL);
            Scanner input = new Scanner(url.openStream());
            while (input.hasNext()) {
                String line = input.nextLine();
                if (line.contains(wordForSearch)) {
                    return true;
                }
            }
        } catch (MalformedURLException ex) {
            throw new MalformedURLException("Invalid URL!");
        } catch (IOException ex) {
            System.out.println("I/O problem has occurred!");
        }
        return false;
    }

    public static ArrayList<String> getSubURLs(String startUrl)
            throws MalformedURLException {
        ArrayList<String> list = new ArrayList<>();

        try {
            URL url = new URL(startUrl);
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
            throw new MalformedURLException("Invalid URL! (in getSubURLs()method");
        } catch (IOException ex) {
            System.out.println("I/O problem has occurred!");
        }
        return list;
    }
}
