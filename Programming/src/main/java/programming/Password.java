package programming;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		
		System.out.println("Enter password :");
		Scanner input = new Scanner(System.in);
		String inputPassword = input.next();		
		Password pass = new Password();
		pass.isPasswordValid(inputPassword);
		input.close();
	}
	
	public void isPasswordValid(String inputPassword){
		
		char[] charPassword = inputPassword.toCharArray();
		int letters = 0;
		int numbers = 0;
		int capital = 0;
		if (charPassword.length < 10){
			System.out.println("Password must contain atleast 10 characters !");
		}else {
			for (int i=0; i<charPassword.length ; i++){
				if(!Character.isLetterOrDigit(charPassword[i])){
					System.out.println("Password must contain only letters and digits");
					break;
				}if (Character.isAlphabetic(charPassword[i])){
					letters ++;
				}if (Character.isDigit(charPassword[i])){
					numbers++;
				}if (Character.isUpperCase(charPassword[i])){
					capital ++;
				}
			}
			
			if(letters<2){
				System.out.println("Password must contain atleast 2 letters");
			}else if (numbers <2){
				System.out.println("Password must contain atleast 2 digits");
			}else if (capital <1){
				System.out.println("Password must contain atleast 1 Upper case");
			}else {
				System.out.println("Password is valid");
			}
		}
		
	}

}
