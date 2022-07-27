package Array;

public class swappingintno {

	public static void main(String[] args) {
		
		
		int b= 45;
		int c=76;
		
		System.out.println("b="+b);
		System.out.println("c="+c);
		//b=c;
		System.out.println("*****");
		System.out.println("b="+b);
		System.out.println("c="+c);
		
		
		int x;
		x=b;   //back up of b in x=45 & b=0
		b=c;  //b=45 then b=c then b=76 &c=0
		c=x;  //c=45 beacause x=45
		System.out.println("c="+c);
		System.out.println("b="+b);
		
		}
	}

