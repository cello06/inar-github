package week_10.assignments;

public class Question_10_04 {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint();
        MyPoint point2 = new MyPoint(10, 30.5);

        System.out.printf("The distance between (%.1f , %.1f) and (%.1f , %.1f) is : %.14f"
                , point1.getX(), point1.getY(),
                point2.getX(), point2.getY(),
                point1.distance(point2));

    }
}
