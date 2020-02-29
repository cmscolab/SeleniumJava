package session1;


import java.util.HashSet;

import java.util.Set;

public class DuplicatePresent {

	public static void main(String[] args) {
		String nameSelf = "CHANDANA";
		char[] charName = nameSelf.toCharArray();
		Set<Character> newSet = new HashSet<Character>();
		for (Character charact : charName) {
			newSet.add(charact);
		}
		int lenString = nameSelf.length();
		int lenSet = newSet.size();
		if (lenSet==lenString){
			System.out.println(nameSelf + " does not contain any duplicate character");
		}else {
			System.out.println(nameSelf + " contains duplicate characters");
		}
		
	}

}
