package week_14;

import java.util.*;

public class Question_14_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String dNA = getDNA(input);
        ArrayList<String> sequencesInDNA = getSequences(dNA, input);
        System.out.println("Repeated letter sequences : " + sequencesInDNA);
    }

    public static String getDNA(Scanner input) {
        input = new Scanner(System.in);
        String dNA;
        while (true) {
            System.out.print("Enter a DNA Sequence :");
            dNA = input.nextLine();
            if (!checkDNA(dNA)) {
                System.out.println("Wrong DNA!"
                        + "\nTo Quit enter -1 , to give another DNA click any button :");
                String check = input.nextLine();
                if (check.equals("-1")) {
                    System.exit(12);
                }
            } else {
                break;
            }
        }
        return dNA;
    }

    public static boolean checkDNA(String dNA) {
        for (int i = 0; i < dNA.length(); i++) {
            if (dNA.charAt(i) != 'A'
                    && dNA.charAt(i) != 'C'
                    && dNA.charAt(i) != 'T'
                    && dNA.charAt(i) != 'G') {
                return false;
            }
        }
        return true;
    }

    public static ArrayList<String> getSequences
            (String dNA, Scanner input) {
        ArrayList<String> partsOfDNA = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        Set<String> result = new HashSet<>();
        while (true) {
            System.out.print("Enter how many letter sequences you want to search :");
            try {
                int countOfLetter = input.nextInt();
                for (int i = 0; i < dNA.length() - countOfLetter; i++) {
                    partsOfDNA.add(dNA.substring(i, i + countOfLetter));
                }
                for (int i = 0; i < partsOfDNA.size(); i++) {
                    if (!map.containsKey(partsOfDNA.get(i))) {
                        map.put(partsOfDNA.get(i), 1);
                    } else {
                        map.put(partsOfDNA.get(i), map.get(partsOfDNA.get(i)) + 1);
                    }
                }
                for (int i = 0; i < partsOfDNA.size(); i++) {
                    if (map.get(partsOfDNA.get(i)) > 1) {
                        result.add(partsOfDNA.get(i));
                    }
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Wrong input!\nTry again!" + "" +
                        "\nTo exit you can enter -1 to continue press any button!");
                String check = input.nextLine();
                if (check.equals("-1")) {
                    System.exit(12);
                }
            }
        }
        ArrayList<String> resultList = new ArrayList<>(result);
        Collections.sort(resultList);
        return resultList;
    }
}
