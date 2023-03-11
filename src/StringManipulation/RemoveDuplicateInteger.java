package StringManipulation;



import java.util.Comparator;

import java.util.TreeSet;

public class RemoveDuplicateInteger {
public static void main(String[] args) {
	int a[]= {1,6,2,4,3,6,3,1};
	removeDuplicateInteger(a);
}
public static void removeDuplicateInteger(int[] a) {
	
	TreeSet<Integer> lhs=new TreeSet<Integer>(new MyComparator());
	
	for(int i:a ) {
		lhs.add(i);
	}
	System.out.println(lhs);
	
}
}
 class MyComparator implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		
		
		return ((Integer) o2).compareTo((Integer) o1);
	}

	
}
