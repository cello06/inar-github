package week_12.assignments;

public class Question_12_01_Without_Exception {
    public static void main(String[] args) {
        String num1 = args[0];
        for (int i = 0; i < num1.length(); i++) {
            if (!Character.isDigit(num1.charAt(i))) {
                System.out.println("Wrong input : " + num1);
                System.exit(1);
            }
        }
        String num2 = args[2];
        for (int i = 0; i < num2.length(); i++) {
            if (!Character.isDigit(num2.charAt(i))) {
                System.out.println("Wrong input : " + num2);
                System.exit(2);
            }
        }
        int num1Int = Integer.parseInt(num1);
        int num2Int = Integer.parseInt(num2);
        System.out.println(num1Int + " " + args[1] + " " + num2Int + " = " + (num1Int + num2Int));
    }
}
