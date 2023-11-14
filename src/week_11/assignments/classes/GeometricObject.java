package week_11.assignments.classes;

public class GeometricObject {
    private String color;
    private boolean isFilled;

    public GeometricObject() {
        this.color = "black";
        this.isFilled = false;
    }

    public GeometricObject(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    @Override
    public String toString() {
        return "Color : " + this.color +
                "\nTriangle is " + ((isFilled) ? "" : "not ") + "filled.";
    }
}
