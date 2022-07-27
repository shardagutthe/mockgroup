package Inheritance;

public class Son extends father {  // single level inheritance operation
	
	// where one class aquires property of another class with the help of 
	//extend keyword
	public void bike() {
		System.out.println("BIKE");
	}
	public static void main(String[] args) {
		
		Son x = new Son();
		x.bike();
		x.car();
		x.Money();
		x.Home();
	}

}
//The cls to have properties are inherited is called as SUBCLASS 
