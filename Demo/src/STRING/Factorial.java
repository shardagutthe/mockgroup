package STRING;

public class Factorial {
	
	public static void main(String[] args) {
		
		int a=6;  //5*4*3*2*1
		
		int fact =1;
		for(int i=5;i>=1;i--) {
			
			fact = fact * i;
			
			
		}
		System.out.println(fact);
		
	}

}
