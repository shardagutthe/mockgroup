package polymorphism;

public class poly {					//method overloading
	
	public void addition(int a,int b) {
		
		System.out.println("addition ="+(a+b));
	}
	
	
	public void addition(int a,int b,int c) {
		
		System.out.println("addtion="+(a+b+c));
	}
	
	
	public static void main(String[] args) {
		poly x = new poly();
		
		x.addition(10, 20);
		x.addition(10, 20, 30);
	}
	

}
