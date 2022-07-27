package polymorphism;

public class polyoverriding extends runtime {
	
	//aquires super class properties into sub class with the help
	//of extend keyword changing definition (possible only non static method)
	
	
	public void test() {
		
		System.out.println("change body");
	}
	
	public static void main(String[] args) {
		polyoverriding x = new polyoverriding();
		x.test();
		runtime y = new runtime();
		y.test();
	}

}
