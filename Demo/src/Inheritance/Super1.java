package Inheritance;

public class Super1 extends Super{

	final int a=10;
	
	final public void test() {
		int a=20;
		System.out.println(a);//local variable from same cls
		System.out.println(this.a); //global variable from same cls
		System.out.println(super.a);//global variable from diff class
	}
	
	public static void main(String[] args) {
		
		Super1 x = new Super1();
		x.test();
		
	}
}
