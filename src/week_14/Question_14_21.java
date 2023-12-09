package week_14;

import java.util.*;

public class Question_14_21 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = getArrayListFromUser("first");
        ArrayList<Integer> list2 = getArrayListFromUser("second");

        list1.addAll(list2);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.size(); i++) {
            if (!map.containsKey(list1.get(i))) {
                map.put(list1.get(i), 1);
            } else {
                map.put(list1.get(i), map.get(list1.get(i)) + 1);
            }
        }
        Set<Integer> result = new HashSet<>();
        for (int i = 0; i < list1.size(); i++) {
            if (map.get(list1.get(i)) > 1) {
                result.add(list1.get(i));
            }
        }
        System.out.println("Intersection of the two lists : " + result);

    }

    public static ArrayList<Integer> getArrayListFromUser(String nameOfList) {
        Scanner input = new Scanner(System.in);
        Set<Integer> numbers = new HashSet<>();
        while (true) {
            System.out.print("Enter the size of your " + nameOfList + " list :");
            try {
                int size = input.nextInt();
                System.out.print("Enter the " + nameOfList + " list : ");
                for (int i = 0; i < size; i++) {
                    int number = input.nextInt();
                    numbers.add(number);
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Wrong input!\n" +
                        "To quit press -1\n" +
                        "To try again press any button!");
                String check = input.nextLine();
                if (check.equals("-1")) {
                    System.exit(12);
                }
            }
        }
        return new ArrayList<>(numbers);
    }
}
