package week_14;

import java.util.*;

public class Question_14_14 {
    public static void main(String[] args) {
        ArrayList<String> words = getWordsFromUser();
        System.out.println("Original list of words : " + words);
        ArrayList<ArrayList<String>> anagramGroups = getAnagramGroups(words);
        System.out.println("Anagram groups : " + anagramGroups);
    }

    public static ArrayList<String> getWordsFromUser() {
        Scanner input = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();
        System.out.println("Enter words (enter -1 to finish) : ");
        while (true) {
            String word = input.next();
            if (word.equals("-1")) {
                break;
            }
            words.add(word);
        }
        return words;
    }

    public static ArrayList<ArrayList<String>> getAnagramGroups
            (ArrayList<String> words) {
        ArrayList<ArrayList<String>> anagramGroups = new ArrayList<>();
        Map<Character, Integer> map;
        Map<Character, Integer> map2;
        Set<String> currentGroup;

        for (int i = 0; i < words.size() - 1; i++) {
            String word = words.get(i);
            boolean control = true;
            for (ArrayList<String> check : anagramGroups) {
                if (check.contains(word)) {
                    control = false;
                }
            }
            if (!control) {
                continue;
            }
            currentGroup = new HashSet<>();
            currentGroup.add(word);

            char[] charsOfWord = word.toCharArray();
            map = new HashMap<>();
            for (char ch : charsOfWord) {
                if (!map.containsKey(ch)) {
                    map.put(ch, 1);
                } else {
                    map.put(ch, map.get(ch) + 1);
                }
            }

            for (int j = i + 1; j < words.size(); j++) {
                String otherWord = words.get(j);
                char[] charsOfOtherWord = otherWord.toCharArray();
                map2 = new HashMap<>();

                for (char ch2 : charsOfOtherWord) {
                    if (!map2.containsKey(ch2)) {
                        map2.put(ch2, 1);
                    } else {
                        map2.put(ch2, map2.get(ch2) + 1);
                    }
                }
                boolean conditionToAddList = true;

                for (int k = 0; k < word.length(); k++) {
                    if (map.get(word.charAt(k)) != map2.get(word.charAt(k))) {
                        conditionToAddList = false;
                        break;
                    }
                }
                if (conditionToAddList) {
                    currentGroup.add(otherWord);
                }
            }
            ArrayList<String> current = new ArrayList<>(currentGroup);
            anagramGroups.add(current);

        }
        return anagramGroups;

    }
}
