package Operators;

public class Incrementdecrementoperator {
	
	public static void main(String[]args) 
	{
		//variable declaration
		
		int a = 10,b = 15;
		int Report1 ,Report2;
		
		//original value
		System.out.println("value of a:"+a);
		
		//Increment operater
		
		Report1 = ++a;
		System.out.println("After Increment:"+ a++);
		
		
		//original value
		System.out.println("value of b:"+b);
		
		//Decrement Operator
		Report2=--b;
		System.out.println("after decrement:"+Report2);
		Report1=--a;
		System.out.println("after decrement:"+Report1);
		Report2=--b;
		System.out.println(Report2);
	}

}



