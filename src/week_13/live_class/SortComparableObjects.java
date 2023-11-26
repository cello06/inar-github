package week_13.live_class;

import java.math.BigInteger;
import java.util.Arrays;

public class SortComparableObjects {
    public static void main(String[] args) {
        String[] cities = {"Savannah","Boston","Atlanta","Tampa"};
        Arrays.sort(cities);
        for (String city : cities) {
            System.out.print(city + " ");
        }
        System.out.println();
        BigInteger[] hugeNumbers = {new BigInteger("1234123234234"),
        new BigInteger("4245234523451323452345"),
        new BigInteger("42345234523")};
        Arrays.sort(hugeNumbers);
        for (BigInteger number : hugeNumbers) {
            System.out.print(number + " ");
        }
    }
}
