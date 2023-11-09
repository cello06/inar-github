package week_10.assignments.test;

import week_10.assignments.classes.MyString1;

public class Question_10_22 {
    public static void main(String[] args) {
        char[] chars = {'I', 'N', 'A', 'R'};
        MyString1 a = new MyString1(chars);
        System.out.println(a);
        MyString1 b = a.toLowerCase();
        System.out.println(b);
        MyString1 c = b.substring(0, 3);
        System.out.println(c);
        System.out.println(c.length());
        System.out.println(a.equals(c));
        MyString1 d = new MyString1(chars);
        System.out.println(a.equals(d));
        MyString1 e = MyString1.valueOf(65913);
        System.out.println(e);
    }
}
