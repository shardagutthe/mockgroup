package STRING;

public class test {
	
	public static void main(String[] args) {
		
		String s1 = "velocity";
		String s2 = "SUCCESSFUL";
		String s3 = "CITY";
		
		System.out.println(s2.charAt(4)); //to print char at any index
		System.out.println(s2.replace("S", "C")); //to replace char
		System.out.println(s2.isEmpty()); //true or false
		System.out.println(s2.concat(s1)); //join two string 
		System.out.println(s2.substring(3)); //print s2 string after 3
		System.out.println(s1.substring(2, 6)); //print substring between two values
		System.out.println(s2.endsWith("UL")); //true or false
		System.out.println(s2.startsWith("SU"));//T or F
		System.out.println(s2.lastIndexOf("S"));//index value of char from last
		System.out.println(s2.indexOf("S"));//index value of char
		System.out.println(s2.contains(s3));  //s2 che char s3 madhe astil tr T otherwise F (sequence matters)
		System.out.println(s1==s2);  //t or F
		System.out.println(s1.equals(s3)); //t or f
		System.out.println(s2.equalsIgnoreCase(s1)); //true or F
		System.out.println(s2.length());//length
		System.out.println(s1.toUpperCase()); 
		System.out.println(s3.toLowerCase());
			
		}
	}

	
	