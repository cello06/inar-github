package week_07.assignments;

import java.util.Arrays;

public class Question_07_23 {
    public static void main(String[] args) {
        boolean[] lockers = new boolean[100];
        int[] students = new int[100];
        for (int i = 0; i < students.length; i++) {
            students[i] = i + 1;
        }
        for (int i = 0; i < students.length; i++) {
            for (int j = i; j < lockers.length; j += i) {//This part is important !!
                if (students[i] == 1) {
                    Arrays.fill(lockers, true);
                    break;
                } else if (students[i] == 2) {
                    Arrays.fill(lockers, false);
                    lockers[i] = true;
                    break;
                } else {
                    if (i == j) continue;
                    lockers[j] = !lockers[j];


                }
            }
        }
        for (int i = 0; i < lockers.length; i++) {
            if (lockers[i]) {
                System.out.print("L" + (i + 1) + " ");
            }
        }
    }
}
