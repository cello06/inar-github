package week_14;

import java.util.*;

public class Question_14_25 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = getRandomlyGeneratedList();
        int randomTarget = (int) (Math.random() * 100 + 2);
        ArrayList<Integer> result = checkForResult(randomTarget, numbers);
        System.out.println("Generated ArrayList : \n" + numbers);
        System.out.println("Generated Target Sum : " + randomTarget);
        System.out.println("Numbers  : " + result);
        System.out.println("Result : " + (result.size() == 2));
    }

    public static ArrayList<Integer> getRandomlyGeneratedList() {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            int randomNumber = (int) (Math.random() * 100);
            result.add(randomNumber);
        }
        return result;
    }

    public static ArrayList<Integer> checkForResult
            (int target, ArrayList<Integer> numbers) {
        Set<Integer> result = new HashSet<>();
        for (int i = 0; i < numbers.size() - 1; i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                if (numbers.get(i) + numbers.get(j) == target &&
                        !Objects.equals(numbers.get(i), numbers.get(j))) {
                    result.add(numbers.get(i));
                    result.add(numbers.get(j));
                }
            }
        }
        return new ArrayList<>(result);
    }
}
