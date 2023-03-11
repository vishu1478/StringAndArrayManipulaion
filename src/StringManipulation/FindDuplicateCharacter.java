//How to find duplicate characters in a String

package StringManipulation;

import java.util.HashMap;
import java.util.Map.Entry;

public class FindDuplicateCharacter {
	public static void main(String[] args) {
		findDuplicateCharacter("swissi");
		findDuplicateCharacter("dfggf");
	}
    public static void findDuplicateCharacter(String str) {
    	char[] charArray=str.toCharArray();
    	HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
    	for(Character ch:charArray) {
    		if(hm.containsKey(ch))
    			hm.put(ch, hm.get(ch)+1);
    		else
    			hm.put(ch, 1);
    	}
    	for(Entry<Character, Integer> en:hm.entrySet()) {
    		if(en.getValue()>=2)
    			System.out.println(en.getKey()+"  "+en.getValue());
    	}
    }
}
