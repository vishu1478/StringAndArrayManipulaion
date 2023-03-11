package StringManipulation;

public class CheckStringPalindrome {
     public static void main(String[] args) {
		boolean check;
		check=checkStringPalindrome("abcba");
		System.out.println(check);
		check=checkStringPalindrome("abcbd");
		System.out.println(check);
	}
     public static boolean checkStringPalindrome(String str) {
    	 String tmp="";
    	 for(int i=str.length();i>0;i--) {
    		 tmp=tmp+str.charAt(i-1);
    	 }
    	 if(str.equals(tmp))
    		 return true;
    	 else
    		 return false;
     }
}
