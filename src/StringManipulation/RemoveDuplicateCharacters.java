package StringManipulation;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class RemoveDuplicateCharacters {

	public static void main(String[] args) {
		removeDuplicateCharacers("adbcaacbbbdd");

	} 
	public static void removeDuplicateCharacers(String str) {
		char[] charArray=str.toCharArray();
		
		LinkedHashSet<Character> lhs=new LinkedHashSet<Character>();
		for(char ch:charArray){
			lhs.add(ch);
		}
		Iterator<Character> itr=lhs.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}
