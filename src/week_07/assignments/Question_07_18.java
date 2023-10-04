package week_07.assignments;

import java.util.Scanner;

public class Question_07_18 {
    public static void main(String[] args) {
        double[] numbers = getNumbers();
        bubbleSort(numbers);
        printList(numbers);
    }
    public static double[] getNumbers(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers : ");
        double[] numbers = new double[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        return numbers;
    }
    public static void bubbleSort(double[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if(numbers[i] > numbers[j]){
                    double temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }
    public static void printList(double[] numbers){
        for (double number : numbers) {
            System.out.print(number + " ");
        }
    }
}
