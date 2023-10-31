package week_09.assignments;

import java.util.GregorianCalendar;

public class Question_09_05 {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();
        showDate(calendar);
        calendar.setTimeInMillis(1234567898765L);
        System.out.println("\n\nAfter setTime :");
        showDate(calendar);
    }

    public static void showDate(GregorianCalendar calendar) {
        System.out.println("Current year :" + calendar.get(GregorianCalendar.YEAR));
        System.out.println("Current month :" + (calendar.get(GregorianCalendar.MONTH)+1));//it starts from 0 as january,to make it show month I add 1
        System.out.println("Current day :" + calendar.get(GregorianCalendar.DAY_OF_MONTH));
    }
}
