package STRING;

public class reverse {
	
	public static void main(String[] args) {
		
		String a = "velocity";
		String rev = "";  //yticoley
		String abc = "";  //velocity
		
		for(int i=a.length()-1;i>=0;i--) { //yticoley
			rev = rev+a.charAt(i);
			}
		
		
		System.out.println(rev);  
		
		for(int j=rev.length()-1;j>=0;j--) {  //velocity
			abc = abc+rev.charAt(j);
		}
		System.out.println(abc);
	}
	

}
