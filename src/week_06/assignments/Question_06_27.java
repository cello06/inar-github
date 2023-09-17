package week_06.assignments;

public class Question_06_27 {
    public static void main(String[] args) {
        printEmirp();
    }
    public static void printEmirp(){
        final int COUNT_OF_NONPALINDROMIC_PRIME_NUMBER = 100;
        final int NONPALINDROMIC_PRIME_NUMBER_PER_LINE = 10;
        int count = 0;
        int number = 11;

        while (count < COUNT_OF_NONPALINDROMIC_PRIME_NUMBER){
            if(isPrime(number) && isPrime(getReverse(number))){
                if(count % NONPALINDROMIC_PRIME_NUMBER_PER_LINE == 0){
                    System.out.printf("\n%7d",number);
                }else {
                    System.out.printf("%7d",number);
                }
                count++;
            }
            number++;
        }
    }
    public static boolean isPrime(int number){
        for (int i = 2; i <= number/2 ; i++) {
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
    public static int getReverse(int number){
        String strOfNumber = Integer.toString(number);
        String reversedNumber = "";

        for (int i = 0; i < strOfNumber.length(); i++) {
            reversedNumber = strOfNumber.charAt(i)+reversedNumber;
        }
        if(strOfNumber.equals(reversedNumber)){
            return 6;//not prime number so that make it false
        }
        return Integer.parseInt(reversedNumber);
    }
}
