package method;

public class Static {

	static int a=20;		//static variable
	
	public static void main(String[] args) {
		
		Static x1 = new Static();
		Static x2 = new Static();		//object creation
		Static x3 = new Static();

	
	System.out.println(x1.a);	//calling variable with ref variable
	System.out.println(x2.a);
	System.out.println(x3.a);
	
	x3.a=30;
	
	System.out.println(x3.a);	//calling variable with ref variable
	System.out.println(x1.a);
	System.out.println(x2.a);
	
	
}
	}
	
	
	
	

