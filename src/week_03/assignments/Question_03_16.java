package week_03.assignments;

public class Question_03_16 {
    public static void main(String[] args) {
        int coordinateOfX = (int) (Math.random() * (50 + 50)) - 50;
        int coordinateOfY = (int) (Math.random() * (100 + 100)) - 100;

        System.out.println("Random coordinate in rectangle centered ad " +
                " (0,0) with width 100 and height 200 : (" + coordinateOfX + ", " + coordinateOfY + ")");
    }
}
