package ABSRACTION;

public class calldefault1 implements Defaultmethod {
	
	public void mart() {
		System.out.println("all shopes open");
	}
	
	
public static void main(String[] args) {
		
		calldefault x = new calldefault();//object of implementation cls
		calldefault1 y = new calldefault1();//object of implementation cls
		
		x.Dmart();//default method of interface is call with implementation cls object
		x.mart();//override method of interface 
		
		
		y.Dmart();
		y.mart();
	}

}
