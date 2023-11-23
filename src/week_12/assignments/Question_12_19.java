package week_12.assignments;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Question_12_19 {
    public static void main(String[] args) {
        try {
            String strOfURL = "https://en.wikipedia.org/wiki/The_Cranberries";
            URL url = new URL(strOfURL);
            Scanner input = new Scanner(url.openStream());
            int countOfWords = 0;
            while (input.hasNext()){
                String line = input.nextLine();
                countOfWords += getCountOfWords(line);
            }
            System.out.println("The total word number is " + countOfWords + " in \n" +
                    strOfURL);
        }catch (MalformedURLException ex){
            System.out.println("Invalid URL!");
        }catch (IOException ex){
            System.out.println("Problem is on stream");
        }
    }
    public static int getCountOfWords(String line){
        line = line.trim();
        String[]words = line.split(" ");
        return words.length;
    }
}
