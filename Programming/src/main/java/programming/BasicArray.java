package programming;

public class BasicArray {

	public static void main(String[] args) {
		int [][] intArray = {
				{1,2,3,4,5},
				{1,2,3,4,5}
				};
		System.out.println(intArray.length);
		for(int i = 0; i<intArray.length; i++){
			for(int j = 0; j<intArray[i].length; j++){
				System.out.print(intArray[i][j] + "  ");
			}
			System.out.println("");
		}

	}

}
