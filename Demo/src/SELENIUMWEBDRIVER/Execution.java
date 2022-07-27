package SELENIUMWEBDRIVER;

public class Execution {  //driver.manage().window().setsize();
	
	public static void main(String[] args) {
		
	Gamma a = new Gamma(); //object creation
	Beta b = a.memo(); //Gamma cha Beta return type and memo method name
	Alpha c = b.Demo(); //beta cha alpha return type demo method name
	c.test();//alpha chi method name  test
	
	a.memo().Demo().test();
	
	
		
	}

}
