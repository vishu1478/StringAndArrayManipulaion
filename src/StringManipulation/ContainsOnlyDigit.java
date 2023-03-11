//How to check if a String contains only digits?

package StringManipulation;

public class ContainsOnlyDigit {
      public static void main(String args[]) {
          containsOnlyDigit("1234");
          containsOnlyDigit("12ee4");
          containsOnlyDigit("sdk");
      }
      public static void containsOnlyDigit(String str) {
    	  try {
    		  Integer.parseInt(str);
    		  System.out.println("String contains only digit");
    		  
    	  }catch(NumberFormatException e) {
    		  System.out.println("string does not contans only digit");
    	  }
      }
} 
