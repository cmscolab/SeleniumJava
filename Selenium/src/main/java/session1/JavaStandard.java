package session1;

public class JavaStandard {
	
	static int myFirstVariable = 5;
	
	public static void main(String[] args) {
		
		int findMySum = myFirstMethod(10);
		System.out.println("Sum :"+findMySum);
		
		
	}

	private static int myFirstMethod(int myInput){
		
		int sum = myInput+myFirstVariable;
		return sum;
	}
}
