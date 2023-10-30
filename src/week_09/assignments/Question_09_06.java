package week_09.assignments;

public class Question_09_06 {
    public static void main(String[] args) {
        int[] numbers = getNumbers();
        shuffle(numbers);
        testSortQuality(numbers);
    }

    public static int[] getNumbers() {
        int[] numbers = new int[100_000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        return numbers;
    }

    public static void shuffle(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int randomIndex = (int) (Math.random() * 100_000);
            int temp = numbers[i];
            numbers[i] = numbers[randomIndex];
            numbers[randomIndex] = temp;
        }
    }

    public static void testSortQuality(int[] numbers) {
        StopWatch stopWatch = new StopWatch();
        //java.util.Arrays.sort(numbers);
        sort(numbers);
        stopWatch.stop();
        System.out.println("The execution time of sorting 100,000 numbers using selection sort :"
                + stopWatch.getElapsedTime() + " milliseconds");
    }

    public static void sort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int currentMin = numbers[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < currentMin) {
                    currentMin = numbers[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                numbers[currentMinIndex] = numbers[i];
                numbers[i] = currentMin;
            }
        }
    }
}
