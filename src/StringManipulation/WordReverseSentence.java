package StringManipulation;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WordReverseSentence {
	public static void main(String[] args) {
		wordReverseSentence("This is a java code");;
	}
     
	public static void wordReverseSentence(String sentence) {
		String word[]=sentence.split(" ");
		int length=word.length;
		List<String> list=new ArrayList<String>();
		for(String s:word)
		list.add(s);
		Collections.reverse(list);
		System.out.println(list);
		
		for(String lis:list) {
			System.out.println(lis);
		}
		for(int i=0;i<length/2;i++) {
			String tmp=word[i];
			word[i]=word[length-i-1];
			word[length-i-1]=tmp;
			
		}
		for(String str:word)
		System.out.println(str);
	}
}
