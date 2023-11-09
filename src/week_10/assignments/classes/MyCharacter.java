package week_10.assignments.classes;

public class MyCharacter {
    private char value;
    public MyCharacter(char value){
        this.value = value;
    }

    public char getValue() {
        return value;
    }

    public static MyCharacter toLowerCase(char ch){
        return new MyCharacter(Character.toLowerCase(ch));
    }
    public static boolean isDigit(char ch){
        return Character.isDigit(ch);
        //return ch >= '0' && ch <= '9';
    }
    public static boolean isLetter(char ch){
        return Character.isLetter(ch);
        //return ch >= 'a' && ch <= 'z' || (ch >= 'A' && ch <= 'Z');
    }
    public static boolean isLetterOrDigit(char ch){
        return isDigit(ch) || isLetter(ch);
    }
    public static boolean isLowerCase(char ch){
        return Character.isLowerCase(ch);
        //return ch >= 'a' && ch <= 'z';
    }
    public static boolean isUpperCase(char ch){
        return Character.isUpperCase(ch);
        //return ch >= 'A' && ch <= 'Z';
    }
    public static int compareTo(char x, char y) {
        return x - y;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
