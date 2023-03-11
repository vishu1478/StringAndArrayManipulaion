//How to count occurrence of a given character in String?

package StringManipulation;

public class OccurranceOfCharacter {
     public static void main(String[] args) {
		occurrenceOfCharacter("javaa", 'a');
	}
     public static void occurrenceOfCharacter(String str, Character ch) {
    	 char[] charArray=str.toCharArray();
    	 int count=0;
    	 for(Character character:charArray) {
    		 if(character==ch)
    			 count++;
    	 }
    	 System.out.println("count of character "+ch+" is:  "+count);
     }
}
