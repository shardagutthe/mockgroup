package Inheritance;

public class This {  //this keyword use for calling golabel variable in same cls 

	int a = 10;
	
	public void add() {
		int a=50;
		
		System.out.println(a);     //local variable
		System.out.println(this.a);  //global variable
	}
	public static void main(String[] args) {
		This x = new This();
		x.add();
		
	}
			
			
			
			

}
