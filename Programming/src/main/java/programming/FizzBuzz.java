package programming;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int firstNumber = input.nextInt();
		System.out.println("Enter the second number:");
		int secondNumber = input.nextInt();
		
		for(int i = firstNumber; i<=secondNumber; i++){
			if(((i%5==0) && (i%3==0))){
				System.out.println("FIZZBUZZ");
			}else if(i%5==0){
				System.out.println("BUZZ");
			}else if(i%3==0){
				System.out.println("FIZZ");
			}else {
				System.out.println(i);
			}
		}
		input.close();

	}

}
