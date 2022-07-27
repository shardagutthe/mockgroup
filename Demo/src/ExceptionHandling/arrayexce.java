package ExceptionHandling;

public class arrayexce {
	
	public static void main(String[] args) {
		
	int a[]= {10,20,30,50,40,60};
	//System.out.println(a[8]);
	
	try {
		System.out.println(a[4]); //risky code
		
	}
	catch(ArrayIndexOutOfBoundsException e) {
		
		System.out.println(a[5]);
		
	}
	
	
	
	
	}
	
	

}
