package Encapsulation;

public class test {
	
	private int a= 10;
	static private int b=20;
	
	public static void set (int d) {
		b=d;
		//a=d;
		
		System.out.println(b);
		
	}
	public int get() {
		return a;
	}
	
	

}
