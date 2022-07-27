package Starpattern;

public class Starpattern1 {
	
	public static void main(String[] args) {
		
		int star=1;
		
		for(int i=1;i<=5;i++) {   //row       outer loop
			
			for(int j=1;j<=star;j++) {   //column   inner loop
				System.out.print("*");
			}
			System.out.println(" ");
			star++;
		}
	}

}
