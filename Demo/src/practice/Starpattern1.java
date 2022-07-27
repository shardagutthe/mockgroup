package practice;

public class Starpattern1 {
	
	public static void main(String[] args) {
		
		int space =0;
		int star = 6;
		
		for(int i=1;i<=6;i++) {
			
			for(int a=1;a<i;a++) {
				System.out.print(" ");
			}
			
			for(int a=i;a<=6;a++) {
				
				System.out.print(a+" ");
			}
			System.out.println();
			
			
		}
	}
}

