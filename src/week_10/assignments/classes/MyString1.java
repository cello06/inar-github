package week_10.assignments.classes;

public class MyString1 {
    private String value;

    public MyString1(char[] chars) {
        this.value = "";
        for (int i = 0; i < chars.length; i++) {
            this.value += chars[i];
        }
    }

    public String getValue() {
        return value;
    }

    public char charAt(int index) {
        return this.value.charAt(index);
    }

    public int length() {
        return this.value.length();
    }

    public MyString1 substring(int begin, int end) {
        char[] chars = new char[end - begin];
        int count = 0;
        for (int i = begin; i < end; i++) {
            chars[count] = this.value.charAt(i);
            count++;
        }
        return new MyString1(chars);
    }

    public MyString1 toLowerCase() {
        char[] chars = new char[this.value.length()];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = Character.toLowerCase(this.value.charAt(i));
        }
        return new MyString1(chars);
    }

    public boolean equals(MyString1 s) {
        return this.value.equals(s.getValue());
    }

    public static MyString1 valueOf(int i) {
        String value = Integer.toString(i);
        char[] chars = new char[value.length()];
        for (int j = 0; j < chars.length; j++) {
            chars[j] = value.charAt(j);
        }
        return new MyString1(chars);
    }

    @Override
    public String toString() {
        return value;
    }
}
