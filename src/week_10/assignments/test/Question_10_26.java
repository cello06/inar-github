package week_10.assignments.test;

public class Question_10_26 {
    public static void main(String[] args) {
        String[] arguments = getArguments(args);
        double result = calculate(arguments);
        System.out.println(arguments[0] + " " + arguments[1] + " " + arguments[2] + " = " + result);

    }

    public static String[] getArguments(String[] args) {
        String firstArg = "";//try to find first digit part
        String secondArg = "";//try to find type of calculation
        String thirdArg = "";//try to find second digit part
        int startIndex = 0;
        for (int i = 0; i < args[0].length(); i++) {
            if (args[0].charAt(i) == ' ') {
                continue;
            }
            if (Character.isDigit(args[0].charAt(i))) {
                firstArg += args[0].charAt(i);
            }
            if (!Character.isDigit(args[0].charAt(i))) {
                startIndex = i;
                break;
            }
        }
        int secondStartPoint = 0;
        for (int i = startIndex; i < args[0].length(); i++) {
            if (!Character.isLetterOrDigit(args[0].charAt(i))) {
                if (args[0].charAt(i) != ' ') {
                    secondArg = String.valueOf(args[0].charAt(i));
                    secondStartPoint = i + 1;
                    break;
                }
            }
        }
        for (int i = secondStartPoint; i < args[0].length(); i++) {
            if (args[0].charAt(i) != ' ' && Character.isDigit(args[0].charAt(i))) {
                thirdArg += args[0].charAt(i);
            }
        }
        return new String[]{firstArg, secondArg, thirdArg};
    }

    public static double calculate(String[] arguments) {
        String firstArg = arguments[0];
        String secondArg = arguments[1];
        String thirdArg = arguments[2];

        double result = 0;

        switch (secondArg) {
            case "+":
                result = Double.parseDouble(firstArg) + Double.parseDouble(thirdArg);
                break;
            case "*":
                result = Double.parseDouble(firstArg) * Double.parseDouble(thirdArg);
                break;
            case "/":
                result = Double.parseDouble(firstArg) / Double.parseDouble(thirdArg);
                break;
            case "-":
                result = Double.parseDouble(firstArg) - Double.parseDouble(thirdArg);
                break;
            default:
                System.out.println("Sth wrong happen");
                System.exit(1);
        }
        return result;
    }
}
