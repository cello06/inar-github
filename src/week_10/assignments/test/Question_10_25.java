package week_10.assignments.test;

public class Question_10_25 {
    public static void main(String[] args) {
        String s = "[Java, inar , aca, demy]";
        String regex = ",";
        String[] result = split(s, regex);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static String[] split(String s, String regex) {
        //I need to know what is the length of my result array
        //And length of my result array is equals to
        //countOfWords  +  countOfRegex;
        int countOfWords = s.split(regex).length;
        int countOfRegex = countRegex(s, regex);
        String[] result = new String[countOfRegex + countOfWords];
        int start = 0;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < regex.length(); j++) {
                if (s.charAt(i) == regex.charAt(j)) {
                    result[count] = s.substring(start, i);
                    count++;
                    result[count] = String.valueOf(regex.charAt(j));
                    count++;
                    start = i + 1;

                }
                if (i == s.length() - 1) {//This part is about last letter of String
                    //if it is not a letter from regex I need to
                    //take letters from last regex to the last od the word
                    int check = 0;
                    for (int k = 0; k < regex.length(); k++) {
                        if (s.charAt(i) != regex.charAt(k)) {
                            check++;
                        }
                    }
                    if (check == regex.length()) {
                        result[count] = s.substring(start);
                    }
                }
            }
        }
        return result;
    }

    public static int countRegex(String s, String regex) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < regex.length(); j++) {
                if (s.charAt(i) == regex.charAt(j)) {
                    count++;
                }
            }
        }
        return count;
    }
}
