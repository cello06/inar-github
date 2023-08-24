package week_04.live_class;

import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       double a= input.nextDouble();
        double b= input.nextDouble();
        double ca=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.println(ca);
    }
}
