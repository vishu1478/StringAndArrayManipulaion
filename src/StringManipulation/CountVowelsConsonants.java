package StringManipulation;

import java.util.ArrayList;

public class CountVowelsConsonants {
     public static void main(String[] args) {
	countVowelsConsonants("swiaertyh");
}
     public static void countVowelsConsonants(String str) { 
    	 char[] charArray=str.toCharArray();
    	 int vowelCount=0;
    	 int consonantCount=0;
    	 ArrayList<Character> al=new ArrayList<Character>();
    	 al.add('a');
    	 al.add('e');
    	 al.add('i');
    	 al.add('o');
    	 al.add('u');
    	for(Character ch:charArray) {
    		 if(al.contains(ch))
    			 vowelCount++;
    		 else
    			 consonantCount++;
    	 }
    	System.out.println("count of vowels: "+vowelCount+" and count of consonants: "+consonantCount);
     }
     
}
