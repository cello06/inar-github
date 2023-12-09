package week_14;

import java.util.*;

public class Question_14_24 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = getRandomlyGeneratedList();
        int absoluteDifferance = (int) (Math.random() * 10 + 1);

        boolean checkForResult = getResult(absoluteDifferance, numbers);

        System.out.println("Array : " + numbers);
        System.out.println("Is there a nearby duplicate" +
                " with absolute difference at most " + absoluteDifferance + " : " + checkForResult);

    }

    public static ArrayList<Integer> getRandomlyGeneratedList() {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> result = new ArrayList<>();
        while (true) {
            System.out.print("Enter size of the list : ");
            try {
                int size = input.nextInt();
                for (int i = 0; i < size; i++) {
                    int number = (int) (Math.random() * 20 + 1);
                    result.add(number);
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("""
                        Wrong input!
                        To try again press any button
                        To quit press -1""");
                String check = input.nextLine();
                if (check.equals("-1")) {
                    System.exit(12);
                }
            }
        }
        return result;
    }

    public static boolean getResult(int absoluteDifferance, ArrayList<Integer> numbers) {

        //This method can be written better in this way ;
        //Firstly you check for duplicate numbers , if there
        //is duplicated numbers then you can check for theirs
        //absolute difference!

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.size() - 1; i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                if (Math.abs(numbers.get(i) - numbers.get(j)) <= absoluteDifferance) {
                    if (!map.containsKey(numbers.get(i))) {
                        map.put(numbers.get(i), 1);
                    } else {
                        map.put(numbers.get(i), map.get(numbers.get(i)) + 1);
                    }
                    if (!map.containsKey(numbers.get(j))) {
                        map.put(numbers.get(j), 1);
                    } else {
                        map.put(numbers.get(j), map.get(numbers.get(j)) + 1);
                    }
                    if (map.get(numbers.get(i)) > 1 && map.get(numbers.get(j)) > 1) {
                        return true;
                    }
                }

            }
        }
        return false;
    }
}
