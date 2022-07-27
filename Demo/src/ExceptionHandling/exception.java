package ExceptionHandling;

public class exception {
	public static void main(String[] args) {
		int a = 20;
		int b = 0;      //Arithmetic exception
		int c = 0;
		int[]d = {54,87,65,45};
		
		System.out.println("Start");
		try {
			c=a/b;  //risky code
			//System.out.println(d[8]);
			}
		catch(ArithmeticException e) {
			//alternative code
			
			System.out.println("Alternative code");
			b=2;
			c=a/b;
		}
		
		System.out.println(c);
		//System.out.println(d[2]);
	}

	
}
