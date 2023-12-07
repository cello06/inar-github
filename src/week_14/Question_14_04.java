package week_14;

import java.util.*;

public class Question_14_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> listA = getListFromUser(input, "A");
        ArrayList<Integer> listB = getListFromUser(input, "B");
        Collections.sort(listA);
        Collections.sort(listB);
        Collections.reverse(listB);
        ArrayList<Integer> listC = merge(listA, listB);
        System.out.println("Merged and sorted ArrayList C :\n" + listC);

    }

    public static ArrayList<Integer> getListFromUser
            (Scanner input, String listName) {
        boolean condition = true;
        ArrayList<Integer> result = new ArrayList<>();
        while (condition) {

            System.out.print("Enter the size 'n' for ArrayList " + listName + " :");
            try {
                int numberOfMember = input.nextInt();
                System.out.print
                        ("Enter " + numberOfMember + " integers for ArrayList " + listName + " :");
                for (int i = 0; i < numberOfMember; i++) {
                    int currentMember = input.nextInt();
                    result.add(currentMember);
                }
                condition = false;
            } catch (InputMismatchException e) {
                System.out.println("Wrong input!\nTry Again");
                input.nextLine();
            }
        }
        return result;
    }

    public static ArrayList<Integer> merge
            (ArrayList<Integer> listA, ArrayList<Integer> listB) {
        ArrayList<Integer> result = new ArrayList<>();
        result.addAll(listA);
        result.addAll(listB);
        return result;
    }

// this method makes user defined sort algorithms for the two list
//    public static ArrayList<Integer> merge
//            (ArrayList<Integer> listA, ArrayList<Integer> listB) {
//        ArrayList<Integer> result = new ArrayList<>();
//        Queue<Integer> forA = new LinkedList<>(listA);
//        Stack<Integer> forB = new Stack<>();
//        forB.addAll(listB);
//        while (!forA.isEmpty() && !forB.isEmpty()) {
//            if (forA.peek() < forB.peek()) {
//                result.add(forA.remove());
//            } else if (forA.peek() > forB.peek()) {
//                result.add(forB.pop());
//            } else {
//                result.add(forA.remove());
//                result.add(forB.pop());
//            }
//        }
//        while (!forA.isEmpty()) {
//            result.add(forA.remove());
//        }
//        while (!forB.isEmpty()) {
//            result.add(forB.pop());
//        }
//        return result;
//    }
}
