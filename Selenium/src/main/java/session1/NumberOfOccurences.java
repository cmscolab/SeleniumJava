package session1;

public class NumberOfOccurences {

	public static void main(String[] args) {
		String a = "Cognizant Software India";
		int num = 0;
		for(int i=0; i<a.length();i++){
			if(a.charAt(i)== 'i'){
				num=num+1;
			}
		}
		System.out.println("Character i occurs "+ num + " times in the given string");
	}

}
