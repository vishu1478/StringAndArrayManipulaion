package ArrayManipulation;

public class BothSideSum {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6};
		
		int leftNum=arr[0];
		int rightNum=arr[1];
		int middleNum=0;
		int length =arr.length;
		for(int i=0;i<length;i++) {
	       if(i==0) {
	    	   leftNum=arr[i];
	    	   arr[i]=arr[i]*rightNum;
	    	  }
	       else if(i==length-1) {
	    	   arr[i]=leftNum*arr[i];
	    		}
	       else {
	    	   middleNum=arr[i];
	    	   rightNum=arr[i+1];
	    	   arr[i]=leftNum*rightNum;
	    	  leftNum=middleNum;
	    	  
	    	   
	       }
		}
		for(Integer a:arr) {
			System.out.println(a);
		}
	}

}
