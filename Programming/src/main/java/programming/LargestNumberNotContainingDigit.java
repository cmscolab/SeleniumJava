package programming;

import java.util.Scanner;

public class LargestNumberNotContainingDigit {

	public static void main(String[] args) {
		
		System.out.println("Enter the Number and digit:");
		Scanner input = new Scanner(System.in);
		int inputNumber = input.nextInt();
		int inputDigit = input.nextInt();
		for (int i = inputNumber -1 ; i > 1; i--){
			String numberString = String.valueOf(i);
			String digitString = String.valueOf(inputDigit);
			if(!numberString.contains(digitString)){
				System.out.println(numberString);
				break;
			}
		}
		
		input.close();

	}

}
