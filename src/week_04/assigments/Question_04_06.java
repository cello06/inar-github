package week_04.assigments;

import java.util.Scanner;

public class Question_04_06 {
    public static void main(String[] args) {
        double angle1=(Math.random()*Math.PI)*2;
        double angle2=(Math.random()*Math.PI)*2;
        double angle3=(Math.random()*Math.PI)*2;

        double xOfPoint1=40*Math.cos(angle1);
        double yOfPoint1=40*Math.sin(angle1);
        double xOfPoint2=40*Math.cos(angle2);
        double yOfPoint2=40*Math.sin(angle2);
        double xOfPoint3=40*Math.cos(angle3);
        double yOfPoint3=40*Math.sin(angle3);

        double sideABetweenPoint1AndPoint2=Math.sqrt(Math.pow(xOfPoint1-xOfPoint2,2)+Math.pow(yOfPoint1-yOfPoint2,2));
        double sideBBetweenPoint2AndPoint3=Math.sqrt(Math.pow(xOfPoint2-xOfPoint3,2)+Math.pow(yOfPoint2-yOfPoint3,2));
        double sideCBetweenPoint1AndPoint3=Math.sqrt(Math.pow(xOfPoint1-xOfPoint3,2)+Math.pow(yOfPoint1-yOfPoint3,2));

        double angleA=Math.acos((sideABetweenPoint1AndPoint2*sideABetweenPoint1AndPoint2-sideBBetweenPoint2AndPoint3*sideBBetweenPoint2AndPoint3-sideCBetweenPoint1AndPoint3*sideCBetweenPoint1AndPoint3)/(-2*sideBBetweenPoint2AndPoint3*sideCBetweenPoint1AndPoint3));
        double angleB=Math.acos((sideBBetweenPoint2AndPoint3*sideBBetweenPoint2AndPoint3-sideABetweenPoint1AndPoint2*sideABetweenPoint1AndPoint2-sideCBetweenPoint1AndPoint3*sideCBetweenPoint1AndPoint3)/(-2*sideABetweenPoint1AndPoint2*sideCBetweenPoint1AndPoint3));
        double angleC=Math.acos((sideCBetweenPoint1AndPoint3*sideCBetweenPoint1AndPoint3-sideBBetweenPoint2AndPoint3*sideBBetweenPoint2AndPoint3-sideABetweenPoint1AndPoint2*sideABetweenPoint1AndPoint2)/(-2*sideABetweenPoint1AndPoint2*sideBBetweenPoint2AndPoint3));

        System.out.println("The three angles are : "+angleA+" "+angleB+" "+angleC);



    }
}
