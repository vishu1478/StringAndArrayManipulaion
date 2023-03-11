package StringManipulation;

public class CheckAnagram2 {
	public static void main(String[] args) {
		checkAnagram2("stop","post");
		checkAnagram2("stop","postt");
		
	}
	public static void checkAnagram2(String str1, String str2) {
		StringBuilder sb=new StringBuilder(str2);
		char[] charArray=str1.toCharArray();
		for (char ch:charArray) {
			int index=sb.indexOf(""+ch);
			if(index != -1)
				sb.deleteCharAt(index);
		}
		if(sb.length()==0)
			System.out.println("anagram");
		else
			System.out.println("not anagram");

	}
}
