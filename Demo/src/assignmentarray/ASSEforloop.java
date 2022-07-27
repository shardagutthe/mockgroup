package assignmentarray;

import java.util.Arrays;

public class ASSEforloop {

	public static void main(String[] args) {   //assending order using for loop
		
		int ar[]= {10,20,40,60,50};
		Arrays.sort(ar);
			
		for(int i =0;i<=ar.length-1;i++) {
			System.out.print(ar[i]+",");
			
		}
		
		
	}
}


	

