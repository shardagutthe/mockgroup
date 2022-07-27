package method;

public class nonstatic {
	
	public void M3() {		//nonstatic method call from same cls
		
		int a= 10;
		int b=20;
		int c=40;
		int d=a+b+c;
		
		System.out.println(d);
		
	}
	//public static void main(String[] args) {
		
	//	nonstatic x = new nonstatic();
	//	x.M3();
	//}

}
