package practice;

public class Starpattern {
	
	public static void main(String[]args) {
		
		for(int i=1;i<=4;i++) {  //row
			
			for(int j=4;j>=i;j--) {  //column
				System.out.print("*");
			}
			System.out.println("");
			
		}
	}

}
