package week_14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Question_14_23 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        while (true) {
            System.out.println("Enter the path of the text file : ");
            String path = new Scanner(System.in).nextLine();
            File file = new File(path);
            try {
                Scanner input = new Scanner(file);
                while (input.hasNext()) {
                    String line = input.nextLine();
                    String[] words = line.split("[\\d+\\s._;}{/:)(=*+\\[\\]\\\\<>,\"\\-]+");
                    for (String word : words) {
                        if (word.equals("")) {
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
                Collections.sort(keys);
                StringBuilder result = new StringBuilder();
                for (int i = 0; i < keys.size(); i++) {
                    if (map.get(keys.get(i)) == 1) {
                        result.append(keys.get(i)).append("\n");
                    }
                }
                System.out.println("Non-duplicate words in ascending order : \n" + result);
                break;

            } catch (FileNotFoundException e) {
                System.out.println("File not found!\n" +
                        "To quit press -1\n" +
                        "To give another path press any button!");
                String check = new Scanner(System.in).nextLine();
                if (check.equals("-1")) {
                    System.exit(12);
                }
            }
        }
    }
}
