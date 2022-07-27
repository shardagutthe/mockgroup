package method;

public class staticargument {
	
	public static void addtion(int a,int b) {
		int c=a+b;
		System.out.println("addition=" +c);
	}
	
	public void multiplication(int a,int b) {
		int c=a*b;
		System.out.println("multiplication="+c);
	}
	public static void main(String[] args) {
		
		addtion(10, 20);
		
		staticargument x = new staticargument();
		x.multiplication(10, 20);
		
	}
	
	
		 
		
			
		
	}



