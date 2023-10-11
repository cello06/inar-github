package week_07.assignments;

public class Question_07_07 {
    public static void main(String[] args) {
        int[] counts = new int[10];

        for (int i = 0; i < 100; i++) {
            int randomNumber = (int) (Math.random() * 10);
            counts[randomNumber]++;
        }
        printCounts(counts);
    }

    public static void printCounts(int[] counts) {
        for (int i = 0; i < counts.length; i++) {
            System.out.println(i + "s : " + counts[i]);
        }
    }
}
