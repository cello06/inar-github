package week_07.assignments;

import java.util.Scanner;

public class Question_07_04 {
    public static void main(String[] args) {
        analyzeScores();
    }

    public static void analyzeScores() {
        int[] scores = getCountsOfEachScores();
        double average = getAverageOfScores(scores);
        int countOfScoresAboveOrEqualToAverage = aboveOrEqualToAverage(scores, average);
        int countOfScoresBelowAverage = belowAverage(scores, average);

        printAnalyzes(average, countOfScoresAboveOrEqualToAverage, countOfScoresBelowAverage);
    }

    public static int[] getCountsOfEachScores() {
        Scanner input = new Scanner(System.in);
        int[] scores = new int[101];
        System.out.print("Enter scores : (negative number signifies end) : ");
        for (int score : scores) {
            score = input.nextInt();
            if (score < 0) {
                score = 0;
                break;
            } else if (score == 100) {
                scores[100]++;
            } else {
                scores[score % 100]++;
            }
        }
        return scores;
    }

    public static double getAverageOfScores(int[] scores) {
        int sum = getSumOfScores(scores);
        int countOfScores = getCountOfScores(scores);
        return (double) (sum) / countOfScores;
    }

    public static int getCountOfScores(int[] scores) {
        int countOfScores = 0;
        for (int score : scores) {
            if (score > 0) {
                countOfScores += score;
            }
        }
        return countOfScores;
    }

    public static int getSumOfScores(int[] scores) {
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > 0) {
                sum += scores[i] * i;
            }
        }
        return sum;
    }

    public static int aboveOrEqualToAverage(int[] scores, double average) {
        int count = 0;
        for (int i = 0; i < scores.length; i++) {
            if (i >= average) {
                count += scores[i];
            }
        }
        return count;
    }

    public static int belowAverage(int[] scores, double average) {
        int count = 0;
        for (int i = 0; i < scores.length; i++) {
            if (i < average) {
                count += scores[i];
            }
        }
        return count;
    }

    public static void printAnalyzes
            (double average, int countOfScoresAboveOrEqualToAverage, int countOfScoresBelowAverage) {
        System.out.println("Average of scores : " + average);
        System.out.println("Number of scores above or equal to average : " + countOfScoresAboveOrEqualToAverage);
        System.out.println("Number of scores below average :  " + countOfScoresBelowAverage);
    }
}
