//Print duplicate characters from Strings

package StringManipulation;

import java.util.HashMap;

import java.util.Map.Entry;

public class FindStringDuplicate {

	public static void main(String[] args) {
	printDuplicate("sassap");
	}
	public static void printDuplicate(String str) {
		char charArray[]=str.toCharArray();
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		for(Character ch:charArray) {
			if(hm.containsKey(ch))
				hm.put(ch, hm.get(ch)+1);
			else
				hm.put(ch, 1);
			}
		System.out.println(hm);
		for(Entry<Character, Integer> m:hm.entrySet()) {
			if(m.getValue()>1)
				System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
