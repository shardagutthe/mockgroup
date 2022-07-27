package method;

public class globalLocal {
	
	int a=30;           //global variable
	
	public void Demo() {
		int b=40;			//local variable
		
		System.out.println(a);
		System.out.println(b);
	}
	
	public void Demo1() {
		int c=20;			//local variable
		
		System.out.println(a);
	 //   System.out.println(b);
		System.out.println(c);
	}
	public static void main(String[] args) {
		
		globalLocal x = new globalLocal();
		x.Demo();
		x.Demo1();
		
	}

}
