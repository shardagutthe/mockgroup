package practice;

public class fibbonacii4 { //0 1 1 2 3 5 8 

	public static void main(String[] args) { //0+1=1 1+1=2 1+2=3 2+3=5
	
		int a=0;
		int b=1;
		int c=6;
		int d;
		
		System.out.print(a+ " "+b);
		
		for(int i=1;i<=6;i++) {
			d=a+b;
			System.out.print(" "+d);
			a=b;
			b=d;
		}
	}
}
