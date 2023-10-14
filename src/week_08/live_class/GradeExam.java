package week_08.live_class;

public class GradeExam {
    public static void main(String[] args) {

        char[][] answers = {
                {'A', 'B', 'A', 'A', 'A', 'B', 'C', 'D', 'E', 'E'},
                {'A', 'B', 'D', 'A', 'B', 'B', 'A', 'D', 'D', 'E'},
                {'A', 'B', 'C', 'A', 'A', 'B', 'C', 'D', 'E', 'E'},
                {'B', 'A', 'A', 'B', 'A', 'C', 'D', 'A', 'E', 'E'},
                {'A', 'E', 'A', 'A', 'C', 'D', 'A', 'D', 'E', 'E'},
                {'A', 'B', 'C', 'D', 'A', 'B', 'C', 'D', 'D', 'E'},
                {'A', 'B', 'D', 'A', 'A', 'B', 'C', 'C', 'E', 'E'},
                {'A', 'B', 'D', 'A', 'A', 'B', 'C', 'D', 'E', 'D'}};

        char[] keys = {'A', 'B', 'D', 'A', 'A', 'B', 'C', 'D', 'E', 'E'};

        for (int student = 0; student < answers.length; student++) {
            int countOfTrueOfThisStudent = 0;
            for (int answer = 0; answer < answers[student].length; answer++) {
                if (answers[student][answer] == keys[answer]) {
                    countOfTrueOfThisStudent++;
                }
            }
            System.out.println("Student " + (student + 1) + "'s correct count is " + countOfTrueOfThisStudent);
        }
    }
}
