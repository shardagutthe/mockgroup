package method;

public class Method1 {
	
	static void Demo() {	//regular method or user define
		System.out.println("a");
		System.out.println("b");
		System.out.println("c");
	}
	
	public static void main(String[] args) {
		
		System.out.println("main method started");
		Demo();
		System.out.println("d");
		Demo();
		System.out.println('e');
		Demo();
		System.out.println("main method ended");
	}

}
