package session1;

public class ReverseString {

	public static void main(String[] args) {
		String a = "Cognizant Software India";
		char[] b = a.toCharArray();
		System.out.println(b);
		//char[] charArry = new char[a.length()];
		String revString = "" ;
		for(int i = 0; i<b.length; i++){
			revString = revString + b[(b.length-1)-i];
		}
		System.out.println(revString);
	}
}
