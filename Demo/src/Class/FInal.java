package Class;

final public class FInal {
	
	final  int a=10;     //0+1=1 1+1=2   //0 1 1 2 3 
	
	final public void  demo() {
		
		final int a=20; //local variable
		System.out.println("final method running");
		System.out.println(a);
		System.out.println(this.a);
		}
	
	public static void main(String[]args)
	{
		System.out.println("GANPATI BAPPA MORYA");
		FInal x = new FInal();
		x.demo();
		
	}
	

}




