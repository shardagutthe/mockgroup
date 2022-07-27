package Constructer;

public class sample1 {    //static method call from same class
	
	
	public static void main(String[] args) {
		System.out.println("main method started");
		M1();
		M2();
	}
	
	public static void M1() { //static user define
		System.out.println("static method from M1");
	}
	
	public static void M2()  {
		System.out.println("static method from M2");
	}

}
