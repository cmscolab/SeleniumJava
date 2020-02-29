package programming;

import java.util.Scanner;

public class Factorial {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int result = 1;
		result = factorialRecurr(number);
		System.out.println("Factorail of " + number + " is " + result);
	}
	
	public static int factorialRecurr(int num ){	
		if(num>1){
		return num*factorialRecurr(num-1);}
		else{
		return 1;
		}
		} 
		

}
