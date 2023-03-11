package StringManipulation;

import java.util.HashMap;
import java.util.Map;


public class NonRepeatedCharacter {

	public static void main(String[] args) {
		nonRepeatedCharacter("swi");

	}
	public static void nonRepeatedCharacter(String string) {
		char[] charArray=string.toCharArray();
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		for(char ch:charArray) {
			if(hm.containsKey(ch))
				hm.put(ch, hm.get(ch)+1);
			else
				hm.put(ch, 1);
			}
		for(Map.Entry<Character, Integer> en:hm.entrySet()) {
			if(en.getValue()==1) {
				System.out.println(en.getKey());
				break;
			}
				
		}
	}

}
