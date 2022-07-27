package practice;

public  class Abscalling extends abs{    //abstraction 

	public void M3() {
		System.out.println("m3 running");
	}
	public void M4() {
		System.out.println("m4 running");
	}
	public static void main(String[] args) {
		Abscalling x =  new Abscalling();
		x.M3();
		x.M4();
		abs.M2();
		
	}
}
