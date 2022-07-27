package STRING;

public class reverse3 {
	
	public static void main(String[] args) { //to count space
		
		String a = " velocity is the best training centre";
		int count = 0;
		
		for(int i=0;i<=a.length()-1;i++) {
			
			char b = a.charAt(i);
			if(b==' ') {
				count++;
			 }
			
		}
		System.out.println(count);
	}

}
