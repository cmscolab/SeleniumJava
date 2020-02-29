package programming;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharacters {

	public static void main(String[] args) {
		
		String finalString = "";
		
		System.out.println("Enter the string:");
		Scanner input = new Scanner(System.in);
		String inputString = input.nextLine();
		char[] charArr = inputString.toCharArray();
		Set <Character> dict = new LinkedHashSet<Character>();
		for(char u : charArr){
			dict.add(u);
		}
		for (char u : dict){			
				finalString = finalString.concat(Character.toString(u));
		}
		System.out.println(finalString);
		input.close();
	}

}
