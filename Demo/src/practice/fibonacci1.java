package practice;

public class fibonacci1 {
	
	public static void main(String[] args) {
	
		int a=0;
		int b=1;
		int c=6;
		int d;
		
		System.out.print(a+" "+b);
		
		for(int i=1;i<=6;i++) {
			d=a+b;
			System.out.print(" "+d);
			a=b;
		    b=d;
			
		}
	}

}
