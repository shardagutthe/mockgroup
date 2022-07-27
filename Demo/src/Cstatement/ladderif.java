package Cstatement;

public class ladderif {
	
public static void main(String[]args) {
		
		String projectDomain = "Booking portal";
		
		if (projectDomain == "Healthcare"){
			System.out.println("Medical Work related");
		}
		else if (projectDomain == "Banking") {
			System.out.println("Money related Transaction work");
		}
		else if (projectDomain == "Telecom") {
			System.out.println("communication related work");
		}
		else if (projectDomain == "Booking portal") {
			System.out.println("work related to travelling ticket");
			
		}
		else {
			System.out.println("Random Project Domain");
		}
		
		
	}


}
