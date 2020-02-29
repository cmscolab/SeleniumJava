package session1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapChar {

	public static void main(String[] args) {
		String nameSelf = "CHANDANA";
		char[] charName = nameSelf.toCharArray();
		Map<Character, Integer> mapName = new HashMap<Character, Integer>();
		for (char c : charName) {
			if(!(mapName.containsKey(c))){
				mapName.put(c, 1);
			}else{
				int val = mapName.get(c);
				mapName.put(c, val+1);
			}
			
		}
		Set<Character> keysSet = mapName.keySet();
		for (Character character : keysSet) {
			if(mapName.get(character) > 1)
			System.out.println(nameSelf + " contains duplicate character");
			break;
		}
		
		for (Character character : keysSet) {
		
			System.out.println(nameSelf + " contains " + character + " " + mapName.get(character) + " times");
		}
	}

}
