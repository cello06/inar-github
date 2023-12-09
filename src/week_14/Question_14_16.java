package week_14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question_14_16 {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        while (true) {
            System.out.println("Enter the file path :");
            try {
                String filePath = new Scanner(System.in).next();
                if (filePath.equals("-1")) {
                    System.exit(12);
                }
                File file = new File(filePath);
                if (!file.exists()) {
                    throw new FileNotFoundException();
                }
                Scanner input = new Scanner(file);
                while (input.hasNext()) {
                    String line = input.nextLine();
                    String[] words = line.split("[\\d+\\s._;}{/:)(=*+\\[\\]\\\\<>,\"\\-]+");
                    for (String word : words) {
                        if (word == "") {
                            continue;
                        }

                        if (!map.containsKey(word)) {
                            map.put(word, 1);
                        } else {
                            map.put(word, map.get(word) + 1);
                        }
                    }
                }
                ArrayList<String> keys = new ArrayList<>(map.keySet());
                System.out.println("Word counts :");
                for (int i = 0; i < keys.size(); i++) {
                    System.out.println(keys.get(i) + "  : " + map.get(keys.get(i)));
                }
                System.out.println("If you want to quit enter -1\n" +
                        "If you want to continue to read another file just click any button!");
                if (new Scanner(System.in).next().equals("-1")) {
                    System.exit(13);
                }

            } catch (FileNotFoundException e) {
                System.out.println("File not found!\nTry Another Path!" +
                        "\n\nIf you want to quit enter -1 ");
                //new Scanner(System.in).nextLine();
            }
        }
    }
}
