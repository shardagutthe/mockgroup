package assignmentarray;

import java.util.Arrays;

public class DESCusingfor{  //Desending order by using for
	
	public static void main(String[] args) {
		
		int ar[]= {27,40,70,50,10};
		Arrays.sort(ar);
		for(int i=ar.length-1;i>=0;i--) {
			System.out.print(ar[i]+",");
		}
		
}
}
	
	

