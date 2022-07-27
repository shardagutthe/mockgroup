package polymorphism;

public class hidingsubcls extends hiding{

	//when both super class and subclass having static method  of same name and same 
	//argument then sub class contains two static method of same name and same argument
	
	
	public static void M1() {
		System.out.println("m1 is not running");
		
	}
	public static void main(String[] args) {
		hidingsubcls x = new hidingsubcls();
		x.M1();
		
	}
}
