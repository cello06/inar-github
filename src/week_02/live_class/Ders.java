import java.util.Scanner;
public class Ders{
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.print("Enter a fahrenheit dergree and"+ 
			" learn what is it in celcius: ");
		double fahrenheit=input.nextDouble();
		//we will calculate the with this formula;
		//9/5*(fahrenheit-32)

		double celcius= (5.0/9)*(fahrenheit-32);
		System.out.println(fahrenheit+" fahrenheit is "+
			celcius+" celcius");

	}
}