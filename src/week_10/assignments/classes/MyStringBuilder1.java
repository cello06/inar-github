package week_10.assignments.classes;

public class MyStringBuilder1 {
    private StringBuilder value;

    public MyStringBuilder1(String s) {
        this.value = new StringBuilder(s);
    }

    public String getValue() {
        return value.toString();
    }

    public MyStringBuilder1 append(MyStringBuilder1 s) {

        this.value.append(s.getValue());
        return new MyStringBuilder1(value.toString());
    }

    public MyStringBuilder1 append(int i) {

        this.value.append(i);
        return new MyStringBuilder1(value.toString());
    }

    public int length() {
        return this.value.length();
    }

    public char charAt(int index) {
        return this.value.charAt(index);
    }

    public MyStringBuilder1 toLowerCase() {
        String result = this.value.toString().toLowerCase();
        return new MyStringBuilder1(result);
    }

    public MyStringBuilder1 substring(int begin, int end) {
        String result = this.value.toString().substring(begin, end);
        return new MyStringBuilder1(result);
    }

    @Override
    public String toString() {
        return this.value.toString();
    }
}
