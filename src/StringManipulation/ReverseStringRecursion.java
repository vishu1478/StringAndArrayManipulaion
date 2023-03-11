package StringManipulation;

public class ReverseStringRecursion {
	 public static void main(String[] args) {
		String string;
		string=reverseStringRecursion("bappp");
		System.out.println(string);
	}
		public static String reverseStringRecursion(String str) {
			if(str.length()<2) {
				return str;
			}
			else
				return reverseStringRecursion(str.substring(1))+str.charAt(0);
			
		}

	}
 

