//check if two Strings are anagrams of each other?

package StringManipulation;

import java.util.Arrays;

public class CheckAnagram {
     public static void main(String[] args) {
	checkAnagram("stop","post");
	checkAnagram("stop","postt");
}

	public static void checkAnagram(String string1, String string2) {
		char charArr1[]=string1.toCharArray();
		char charArr2[]=string2.toCharArray();
		Arrays.sort(charArr1);
		Arrays.sort(charArr2);
		String str11=String.valueOf(charArr1);
		String str12=String.valueOf(charArr2);
		if(str11.equals(str12))
			System.out.println("anagram");
		else
			System.out.println("not anagram");
	}
}
