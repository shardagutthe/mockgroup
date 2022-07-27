package Assignment;

// 2) create class declare variable static non static Perform
//Inheritance create object of subclass and call this 
//variable both in same and different class.


public class Inheritance {  //call variable in same class
	 static int c=10;			//static variable
	 int  a=30;				//global variable
	 
	 public void add() {
		 
		 int b=20; 				  //local variable
		 System.out.println(a);
		 System.out.println(b);
	 }
	
	 public static void main(String[] args) {
		 Inheritance x = new Inheritance ();
		 x.add();
		 System.out.println(c);
		
	}
}
	

//}
