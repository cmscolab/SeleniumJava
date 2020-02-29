package programming;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FactorsAndPrimeFactors {

	public static void main(String[] args) {
		
		System.out.println("Enter the number :");
		Scanner input = new Scanner(System.in);
		int inputNumber = input.nextInt();
		FactorsAndPrimeFactors obj = new FactorsAndPrimeFactors();
		Set <Integer> ofFactors = obj.factorsOfNumber(inputNumber);
		primeFactors(ofFactors, inputNumber);
		input.close();
		
		

	}
	
	private Set<Integer> factorsOfNumber(int num){
		Set<Integer> factors = new HashSet<Integer>();
		for(int i =2 ; i<num; i++){
			if (num%i == 0){
				factors.add(i);
			}
		}
		System.out.println("The factors of "+ num + " are "+ factors);
		return factors;
	}
	
	private static void primeFactors(Set<Integer> factors, int num){
		Set<Integer> primeFactorsset = new HashSet<Integer>();
		for(int j : factors){
			
			int check = primeOrNot(j);
			if (check == 0){
				primeFactorsset.add(j);
			}
			}
		
		if(num%2==0){
			primeFactorsset.add(2);
		}
		
		System.out.println("The Prime factors of " +  num +  " are "+ primeFactorsset);
		
	}
	
	private static int primeOrNot(int num){
				int flag =0;
				for (int u = 2; u < num; u++){
					if(num % u == 0){
						flag = 1 ; 
						break;
					}
				}
				return flag;
	}

}
