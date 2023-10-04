package week_07.assignments;

public class Question_07_16 {
    public static void main(String[] args) {
        int[] array = getRandomlyGeneratedArray();
        int key = randomKey();
        printExecutionTimeForLinear(array, key);
        java.util.Arrays.sort(array);
        printExecutionTimeForBinary(array, key);
    }

    public static void printExecutionTimeForLinear(int[] array, int key) {

        long startTime = System.nanoTime();
        int indexOfKeyWithLinear = linearSearch(array, key);
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;
        System.out.println("Execution time of invoking the linearSearch in milliseconds " + executionTime);

    }

    public static void printExecutionTimeForBinary(int[] array, int key) {

        long startTime = System.nanoTime();
        int indexOfKeyWithBinary = binarySearch(array, key);
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;
        System.out.println("Execution time of invoking the binarySearch in milliseconds " + executionTime);
    }

    public static int[] getRandomlyGeneratedArray() {
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        array = shuffleArray(array);
        return array;
    }

    public static int[] shuffleArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int randomIndex = (int) (Math.random() * 100000);
            int temp = array[i];
            array[i] = array[randomIndex];
            array[randomIndex] = temp;
        }
        return array;
    }

    public static int randomKey() {
        return (int) (Math.random() * 100000);
    }

    public static int linearSearch(int[] array, int key) {

        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] array, int key) {

        int low = 0;
        int high = array.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < array[mid]) {
                high = mid - 1;
            } else if (key == array[mid]) {
                return mid;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }


}
