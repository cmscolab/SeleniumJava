package programming;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		System.out.println("Enter the year :");
		Scanner input = new Scanner(System.in);
		int inputYear = input.nextInt();
		
		if ((inputYear % 100 ==0) && (inputYear%400==0)){
			
			System.out.println(inputYear + " is a Leap Year");
			
		}else if ((!(inputYear %100 == 0)) && (inputYear%4 ==0)){
			
			System.out.println(inputYear + " is a leap Year");
			
		}else{
			
			System.out.println(inputYear + " is not a leap year");
		}
		
		 input.close();
	}

}
