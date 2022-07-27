package ABSRACTION;

public class Test implements velo { //interface property are implemented
	
	public void Q1() { //method from interface complete here
		
		System.out.println("Q1 method is running");
	}
	public void Q2() { //method from interface complete here
		
		System.out.println("Q2 method is running");
	}
	public static void main(String[] args) {
		
		Test x = new Test(); //implementation class object created
		x.Q1();
		x.Q2();
		velo.M1(); //static method of interface always call with interface name only
	}
	
	

}
