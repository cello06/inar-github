package week_12.assignments.classes;

public class HexFormatException extends Exception {

    public HexFormatException() {
        super("It is not a hex string. !");
    }
}
