package week_13.assignments.classes;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

    private double radius;

    public ComparableCircle() {
        this(1);
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (super.getArea() < o.getArea()) {
            return -1;
        } else if (super.getArea() > o.getArea()) {
            return 1;
        } else {
            return 0;
        }
    }
}
