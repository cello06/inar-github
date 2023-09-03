package week_05.live_class;

public class PrimeNumber {
    public static void main(String[] args) {

        String listOfPrimeNumber = "";


        int count=0;

        int number = 2;



        while(count<50){

            boolean isPrimeNumber=true;


            for(int i = 2 ; i<=number/2;i++){

                if(number%i==0){

                    isPrimeNumber=false;
                    break;
                }
            }



            if(isPrimeNumber){

                if(count%10==0){

                    listOfPrimeNumber+="\n"+number;

                }else {

                    listOfPrimeNumber+=" "+number;

                }

                count++;

            }

            number++;

        }

        System.out.println("The first 50 prime numbers are"+
                listOfPrimeNumber);
    }
}
