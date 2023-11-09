package week_10.assignments.test;

import week_10.assignments.classes.MyStringBuilder1;

public class Question_10_27 {
    public static void main(String[] args) {
        MyStringBuilder1 a = new MyStringBuilder1("La Casa De Papel--");
        System.out.println(a);
        MyStringBuilder1 b = new MyStringBuilder1("@El Professor");
        System.out.println(a.append(b));
        System.out.println(a.append(4161));
        System.out.println(a.length());
        System.out.println(a.charAt(11));
        System.out.println(a.toLowerCase());
        a = a.toLowerCase();
        System.out.println(a);
        System.out.println(a.substring(19, 31));
        a = a.substring(19, 31);
        System.out.println(a);
    }
}
