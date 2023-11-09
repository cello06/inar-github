package week_10.assignments.classes;

import java.util.Locale;

public class MyStringBuilder2 {
    private StringBuilder value;

    public MyStringBuilder2() {
    }

    public MyStringBuilder2(char[] chars) {
        String result = "";
        for (int i = 0; i < chars.length; i++) {
            result += chars[i];
        }
        this.value = new StringBuilder(result);
    }

    public MyStringBuilder2(String s) {
        this.value = new StringBuilder(s);
    }

    public StringBuilder getValue() {
        return value;
    }

    public MyStringBuilder2 insert(int offset, MyStringBuilder2 s) {
        String insertingStr = s.getValue().toString();
        this.value.insert(offset, insertingStr);
        return new MyStringBuilder2(this.value.toString());
    }

    public MyStringBuilder2 reverse() {
        this.value.reverse();
        return new MyStringBuilder2(this.value.toString());
    }

    public MyStringBuilder2 substring(int begin) {
        return new MyStringBuilder2(this.value.substring(begin));
    }

    public MyStringBuilder2 toUpperCase() {
        String result = this.value.toString();
        result = result.toUpperCase(Locale.ROOT);
        return new MyStringBuilder2(result);
    }


    @Override
    public String toString() {
        return this.value.toString();
    }
}
