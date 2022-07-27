package Assignment;

public class callinterface implements test,test2,test3 {
	
	public void test2() {
		int z=a+b;
		int s=x-y;
		
		System.out.println(z);
		System.out.println(s);
		}

	public static void main(String[] args) {
		callinterface x = new callinterface();
		x.test2();
		System.out.println(x.m);
		
	}
}



