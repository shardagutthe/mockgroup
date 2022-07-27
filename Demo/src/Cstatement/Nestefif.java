package Cstatement;

public class Nestefif {
	
	public static void main(String[]args) {
		String UN= "ABC";
		String PWD = "XYZ";
		
		if(UN == "ABC") {
			System.out.println("Correct User name");
			
			if(PWD == "XYZ") {
				System.out.println("Password is Correct");
				System.out.println("Login Succesful");
			}
			
			else {
				System.out.println("Wrong Password");
				System.out.println("Login is failed");
			}
		}
		else {
			System.out.println("Wrong User name");
			System.out.println("Login Failed");
		}

		}

}
