package practice;

public class Sharucall implements sharu{
	
	public void M2() {
		System.out.println("M2 calling");
		
	}
	public void M3() {
		System.out.println("M3 calling");
	}
	public static void main(String[] args) {
		Sharucall a = new Sharucall();
		a.M2();
		a.M3();
		sharu.M1();
	}

}
