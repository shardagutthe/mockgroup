package assignmentarray;

import java.util.Arrays;  //assending order using while loop

public class ASSEwhileloop {
	public static void main(String[] args) {
	
		int ar[]= {10,20,40,60,50};
	Arrays.sort(ar);
	int i = 0;
	while( i<=ar.length-1) {
		System.out.print(ar[i]+",");
		i++;
		
	}
	}

}
