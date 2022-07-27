package Array;

public class array1 {
	
	public static void main(String[] args) {
		
		String array[] = new String[5];  //SYNTAX
		
		array[0] = "JAVA";
		array[1] = "AUTOMATION";
		array[2] = "MANUAL";
		array[3] = "SQL";
		array[4] = "SELENIUM";
		
		
       //IMP PONINT IMP ERROR//
		//array[5] = "AJB";  //Index 5 out of bounds for length 5
								//at Array.array1.main(array1.java:14)

		
		System.out.println(array[4]);
	}

}
