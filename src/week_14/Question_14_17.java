package week_14;

import java.util.*;

public class Question_14_17 {
    public static void main(String[] args) {
        Map<Integer, Integer> map = getNumbersAsMap();
        int maxValueOfMap = getMaxValueOfMap(map);
        printMostOccurredNumbers(map, maxValueOfMap);
    }

    public static Map<Integer, Integer> getNumbersAsMap() {
        Scanner input = new Scanner(System.in);
        Map<Integer, Integer> result = new HashMap<>();
        System.out.println("Enter integers (enter 0 to stop) : ");
        while (true) {

            try {
                int number = input.nextInt();
                if (number == 0) {
                    break;
                }
                if (!result.containsKey(number)) {
                    result.put(number, 1);
                } else {
                    result.put(number, result.get(number) + 1);
                }
            } catch (InputMismatchException e) {
                System.out.println("Wrong input!\nTry Again!");
                input.nextLine();
            }
        }
        return result;
    }

    public static int getMaxValueOfMap(Map<Integer, Integer> map) {
        ArrayList<Integer> keys = new ArrayList<>(map.keySet());
        int valueMax = 0;
        for (int i = 0; i < keys.size(); i++) {
            if (map.get(keys.get(i)) > valueMax) {
                valueMax = map.get(keys.get(i));
            }
        }
        return valueMax;
    }

    public static void printMostOccurredNumbers
            (Map<Integer, Integer> map, int maxValueOfMap) {
        ArrayList<Integer> numbers = new ArrayList<>(map.keySet());
        for (int i = 0; i < numbers.size(); i++) {
            if (map.get(numbers.get(i)) == maxValueOfMap) {
                System.out.println(numbers.get(i) + " --> "
                        + map.get(numbers.get(i)) + " times.");
            }
        }
    }
}
