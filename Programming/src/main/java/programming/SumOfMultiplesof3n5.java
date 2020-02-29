package programming;

public class SumOfMultiplesof3n5 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i<100 ; i++){
			if ( (i%3==0) || (i%5==0) ){
				
				sum = sum + i;
				
			}
		}
		
		System.out.println("The sum of multiples of 3 or 5  under 100 is " + sum);

	}

}
