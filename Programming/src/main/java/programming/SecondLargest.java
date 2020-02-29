package programming;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		
		int[] intArray = {20,340,21,879,92,21,474,83647, -200};
		Arrays.sort(intArray);
		System.out.println("Second largest in the array is " + intArray[intArray.length - 2]);

	}

}
