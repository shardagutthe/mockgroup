package method;

public class Sample {				//static method call from same class
	
	public static void M1() {
		
		System.out.println("static method M1");
	}
	public static void M2() {
		
		System.out.println("static method M2 ");
	}
	
	public static void main(String[] args) {
		
		System.out.println("main method started");
		M1();
		M2();
		System.out.println("main method ended");
	}
}
