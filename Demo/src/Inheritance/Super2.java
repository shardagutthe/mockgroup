package Inheritance;

public class Super2 extends Super1 {
	
	int a = 50;  //global variable
	
	public void Demo() {
		System.out.println(this.a); //global varable from same cls
		System.out.println(super.a);//global variable from diff cls
	}
	
	public static void main(String[] args) {
		
		Super2 x = new Super2();
		x.Demo();
		x.test();
		
	}
	
	

}
