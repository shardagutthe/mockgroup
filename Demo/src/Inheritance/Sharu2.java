package Inheritance;

public class Sharu2 extends Sharu1 { //concerete class 
	
	public void show() {                  //complete method of Sharu1
		System.out.println("running show mwthod");
	}
	
	public void blank() {        //complete method of Sharu1
		System.out.println("running blank method");
	}
	
	public static void main(String[] args) {
		
		 Sharu2 a = new  Sharu2();
		 a.blank();
		 a.display();
		 a.show();
		
	}			

		
}
