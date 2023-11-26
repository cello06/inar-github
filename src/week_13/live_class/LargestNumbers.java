package week_13.live_class;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class LargestNumbers {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        list.add(45);
        list.add(3445.53);
        list.add(new BigInteger("3444444444444444444444000"));
        list.add(new BigDecimal("2.234232323234342343423423423000"));

        System.out.println("The largest number is " +
                getLargestNumber(list));
    }

    public static Number getLargestNumber(ArrayList<Number> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        Number largestNumber = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).doubleValue() > largestNumber.doubleValue()) {
                largestNumber = list.get(i);
            }
        }
        return largestNumber;
    }
}
