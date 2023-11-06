package week_09.assignments.test;

import java.util.Random;

public class Question_09_04 {
    public static void main(String[] args) {
        Random random = new Random(1000);

        for (int i = 0; i < 50; i++) {
            int currentRandom = random.nextInt(100);
            if((i+1)%10 == 0){
                System.out.printf("%3d\n",currentRandom);
            }else {
                System.out.printf("%3d",currentRandom);
            }
        }
    }
}
