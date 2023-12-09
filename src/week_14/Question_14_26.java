package week_14;

import java.util.LinkedList;
import java.util.Queue;

public class Question_14_26 {
    public static void main(String[] args) {
        LinkedList<Integer> list = getRandomlyGeneratedLinkedList();
        System.out.println("Original Linked List : \n" + list);
        upDateList(list);
        System.out.println("Updated Linked List : \n" + list);
    }

    public static LinkedList<Integer> getRandomlyGeneratedLinkedList() {
        LinkedList<Integer> list = new LinkedList<>();
        int sizeOfList = 5;
        for (int i = 0; i < sizeOfList; i++) {
            int random = (int) (Math.random() * 100 + 1);
            list.add(random);
        }
        return list;
    }

    public static void upDateList(LinkedList<Integer> list) {
        Queue<Integer> queue = new LinkedList<>();
        int count = 0;
        int sizeOfList = 5;
        for (int i = 0; i < sizeOfList; i++) {
            queue.add(list.get(i + count));
            int currentGCD;

            if (queue.size() == 2) {
                int firstNumber = queue.remove();
                int secondNumber = queue.peek();
                currentGCD = gcd(firstNumber, secondNumber);
                list.add(i + count, currentGCD);
                count++;
            }

        }
    }

    public static int gcd(int first, int second) {
        int lowerNumber = Math.min(first, second);
        int possibleGCD = 2;
        int number = 1;
        while (number <= lowerNumber) {
            if (first % number == 0 && second % number == 0) {
                possibleGCD = number;
            }
            number++;
        }
        return possibleGCD;
    }
}
