package Constructer;

public class Sample {
	
	//Default constructer provider by compiler
	
	public  void Demo() {
		System.out.println(" running method : M2");
	}
	
public static void main(String[] args) {
		
		System.out.println("main method started");
		
		Sample x = new Sample(); //User define constructer
		
		x.Demo();
		
		System.out.println("main method ended");
	
	
}

 

}


