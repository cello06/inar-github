package week_08.assignments;

import java.util.Scanner;

public class Question_08_37 {
    public static void main(String[] args) {
        String[][] statesAndTheirCapitals = getStatesAndTheirCapitals();
        testCapital(statesAndTheirCapitals);
    }

    public static String[][] getStatesAndTheirCapitals() {
        String[][] stateCapitals = {
                {"Alabama", "Montgomery"},
                {"Alaska", "Juneau"},
                {"Arizona", "Phoenix"},
                {"Arkansas", "Little Rock"},
                {"California", "Sacramento"},
                {"Colorado", "Denver"},
                {"Connecticut", "Hartford"},
                {"Delaware", "Dover"},
                {"Florida", "Tallahassee"},
                {"Georgia", "Atlanta"},
                {"Hawaii", "Honolulu"},
                {"Idaho", "Boise"},
                {"Illinois", "Springfield"},
                {"Indiana", "Indianapolis"},
                {"Iowa", "Des Moines"},
                {"Kansas", "Topeka"},
                {"Kentucky", "Frankfort"},
                {"Louisiana", "Baton Rouge"},
                {"Maine", "Augusta"},
                {"Maryland", "Annapolis"},
                {"Massachusetts", "Boston"},
                {"Michigan", "Lansing"},
                {"Minnesota", "St. Paul"},
                {"Mississippi", "Jackson"},
                {"Missouri", "Jefferson City"},
                {"Montana", "Helena"},
                {"Nebraska", "Lincoln"},
                {"Nevada", "Carson City"},
                {"New Hampshire", "Concord"},
                {"New Jersey", "Trenton"},
                {"New Mexico", "Santa Fe"},
                {"New York", "Albany"},
                {"North Carolina", "Raleigh"},
                {"North Dakota", "Bismarck"},
                {"Ohio", "Columbus"},
                {"Oklahoma", "Oklahoma City"},
                {"Oregon", "Salem"},
                {"Pennsylvania", "Harrisburg"},
                {"Rhode Island", "Providence"},
                {"South Carolina", "Columbia"},
                {"South Dakota", "Pierre"},
                {"Tennessee", "Nashville"},
                {"Texas", "Austin"},
                {"Utah", "Salt Lake City"},
                {"Vermont", "Montpelier"},
                {"Virginia", "Richmond"},
                {"Washington", "Olympia"},
                {"West Virginia", "Charleston"},
                {"Wisconsin", "Madison"},
                {"Wyoming", "Cheyenne"}
        };
        return stateCapitals;

    }

    public static void testCapital(String[][] statesAndTheirCapitals) {
        Scanner input = new Scanner(System.in);
        int countOfCorrect = 0;
        for (int i = 0; i < statesAndTheirCapitals.length; i++) {
            System.out.print("What is the capital of " + statesAndTheirCapitals[i][0] + " ?");
            String answer = input.nextLine();
            if (checkAnswer(answer, statesAndTheirCapitals[i][1])) {
                System.out.println("Your answer is correct");
                countOfCorrect++;
            } else {
                System.out.println("The correct answer should be " + statesAndTheirCapitals[i][1]);
            }
        }
        System.out.println("The correct count is " + countOfCorrect);
    }

    public static boolean checkAnswer(String answerOfUser, String trueAnswer) {
        return answerOfUser.equalsIgnoreCase(trueAnswer);
    }
}
