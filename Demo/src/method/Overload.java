package method;

public class Overload {
	
	public static void main(int a) {    //regular  //user define
		
		System.out.println(a);
		
	}
	public static void main(String[] args) {		//system define
		
		System.out.println("main method is started");
		
		main(60);
		main('$');
		
	}
	
	public static void main(char x) {		//user define
		
		System.out.println(x);
		
	}

}
