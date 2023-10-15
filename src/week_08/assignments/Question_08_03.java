package week_08.assignments;

public class Question_08_03 {
    public static void main(String[] args) {
        examClass();
    }

    public static void examClass() {
        char[][] answersOfStudents = getAnswersOfStudents();
        char[] answerKey = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        int[] examResults = getExamResults(answersOfStudents, answerKey);
        printResultsIncreasingOrder(examResults);
    }

    public static char[][] getAnswersOfStudents() {
        return new char[][]{
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
    }

    public static int[] getExamResults(char[][] answersOfStudents, char[] answerKey) {
        int[] results = new int[8];
        for (int student = 0; student < answersOfStudents.length; student++) {
            int countOfTrueForThisStudent = 0;
            for (int answer = 0; answer < answersOfStudents[student].length; answer++) {
                if (answersOfStudents[student][answer] == answerKey[answer]) {
                    countOfTrueForThisStudent++;
                }
            }
            results[student] = countOfTrueForThisStudent;
        }
        return results;
    }

    public static void printResultsIncreasingOrder(int[] examResults) {

        int[] studentNumbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        //sorting correct numbers with student numbers
        for (int i = 0; i < examResults.length - 1; i++) {
            int currentMin = examResults[i];
            int currentMinIndex = i;
            int studentMin = studentNumbers[i];

            for (int j = i + 1; j < examResults.length; j++) {
                if (currentMin > examResults[j]) {
                    currentMin = examResults[j];
                    currentMinIndex = j;
                    studentMin = studentNumbers[j];
                }
            }
            if (currentMinIndex != i) {
                examResults[currentMinIndex] = examResults[i];
                examResults[i] = currentMin;
                studentNumbers[currentMinIndex] = studentNumbers[i];
                studentNumbers[i] = studentMin;
            }
        }
        for (int i = 0; i < examResults.length; i++) {
            System.out.println("Student " + studentNumbers[i] + "'s correct count is " + examResults[i]);
        }
    }
}
