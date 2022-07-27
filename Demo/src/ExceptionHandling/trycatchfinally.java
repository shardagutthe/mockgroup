package ExceptionHandling;

public class trycatchfinally {
	
	//Exception is not generated => try - finally - normal flow
	//Exception generated but not handled => try - finally
	//Exception generated but handled => try - catch - finally - normal flow
	
public static void main(String[] args) {
	int a = 20;
	int b = 2;
	int c = 0;
	int[]d= {54,35,60,69};
	
	System.out.println("start");
	
	try {
		c=a/b;  //risky code
		System.out.println(d[9]);//array index out of bounds exception
		}
	
	catch(ArithmeticException e){
		//alternative code
		b=4;
		c=a/b;
		
		System.out.println("Alternative code");
		System.out.println("catch block executed");
		
		}
	finally {
		System.out.println("execution of finally block");
	}
	System.out.println(c);
	
	System.out.println("end"); //normal flow

	
	
	}
}
