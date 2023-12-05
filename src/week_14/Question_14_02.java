package week_14;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Question_14_02 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        generateList(numbers);
        System.out.println("Generated ArrayList :\n" + numbers);


        Set<Integer> notDuplicatedNumbers = new HashSet<>(numbers);
        System.out.println("ArrayList after removing duplicates :\n" + notDuplicatedNumbers);

    }

    public static void generateList(ArrayList<Integer> list) {
        for (int i = 0; i < 50; i++) {
            int randomNumber = (int) (Math.random() * 100);
            list.add(randomNumber);
        }
    }

}
