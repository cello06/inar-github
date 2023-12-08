package week_14;

import java.util.*;

public class Question_14_13 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = getRandomlyGeneratedList();
        System.out.println("Generated integers : " + numbers);
        ArrayList<Integer> reappearingNumbers = getReappearingNumbers(numbers);
        System.out.println("Elements appearing more than n/3 times : " + reappearingNumbers);
    }

    public static ArrayList<Integer> getRandomlyGeneratedList() {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> result = new ArrayList<>();
        while (true) {
            System.out.print("Enter the size of ArrayList :");
            try {

                int size = input.nextInt();
                if (size == 0) {
                    throw new RuntimeException("There is no list to check!");
                }
                for (int i = 0; i < size; i++) {
                    int randomNumber = (int) (Math.random() * 3);
                    result.add(randomNumber);
                }
                break;
            } catch (InputMismatchException ex) {
                System.out.println("Wrong input!\nTry Again !");
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
            input.nextLine();

        }
        return result;
    }

    public static ArrayList<Integer> getReappearingNumbers
            (ArrayList<Integer> numbers) {
        //I will add this list the
        // numbers that appear more than n/3 times
        ArrayList<Integer> result = new ArrayList<>();
        //I used map because I need to know the count of numbers
        //according to key value principle
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (!map.containsKey(numbers.get(i))) {
                map.put(numbers.get(i), 1);
            } else {
                map.put(numbers.get(i), map.get(numbers.get(i)) + 1);
            }
        }
        
        Set<Integer> set = new HashSet<>(map.keySet());
        ArrayList<Integer> keyList = new ArrayList<>(set);
        for (int i = 0; i < keyList.size(); i++) {
            if (map.get(keyList.get(i)) > (numbers.size() / 3)) {
                result.add(keyList.get(i));
            }
        }
        return result;
    }
}
