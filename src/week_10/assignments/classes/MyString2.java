package week_10.assignments.classes;

import java.util.Locale;

public class MyString2 {
    private String value;

    public MyString2(String s) {
        this.value = s;
    }

    public String getValue() {
        return value;
    }

    public int compare(String s) {
        return this.value.compareToIgnoreCase(s);
    }

    public MyString2 substring(int begin) {
        String result = this.value.substring(begin);
        return new MyString2(result);
    }

    public MyString2 toUpperCase() {
        String result = this.value.toUpperCase(Locale.ROOT);
        return new MyString2(result);
    }

    public char[] toChars() {
        char[] result = new char[this.value.length()];
        for (int i = 0; i < result.length; i++) {
            result[i] = this.value.charAt(i);
        }
        return result;
    }

    public static MyString2 valueOf(boolean b) {
        String result;
        if (b) {
            result = "true";
        } else {
            result = "false";
        }
        return new MyString2(result);
    }

    @Override
    public String toString() {
        return this.value;
    }
}
