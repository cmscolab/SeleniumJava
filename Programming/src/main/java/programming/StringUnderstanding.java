package programming;

public class StringUnderstanding {

	public static void main(String[] args) {
		
		String str1 = "TestLeaf Java";
		String str2 = "TestLeaf Java";
		String str3 = new String("TestLeaf Java");
		String str4 = new String("testleaf java");
		String str5 = new String("Java");
		
		System.out.println(str1 == str2); 
		System.out.println(str1.equals(str2));
		System.out.println(str1==str3);
		System.out.println(str1.equals(str3));
		System.out.println(str1.equalsIgnoreCase(str4));
		System.out.println(str3.contains(str5));
		

	}

}
