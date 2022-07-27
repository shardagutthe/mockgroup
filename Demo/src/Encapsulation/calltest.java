package Encapsulation;

public class calltest extends test {

	public static void main(String[] args) {
		
	test.set(100);
	
	calltest x = new calltest();
	int y = x.get();
	System.out.println(y);
	}
}
