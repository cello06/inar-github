package week_09.assignments;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean getOn() {
        return on;
    }

    public void setOn(boolean isOn) {
        on = isOn;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    Fan() {
    }

    @Override
    public String toString() {
        if (getOn()) {
            return "Fan speed :" + speed + ", color : " + color + ", radius :" + radius;
        } else {
            return "Fan color :" + color + ", radius : " + radius + "\nFan is off";
        }
    }
}
