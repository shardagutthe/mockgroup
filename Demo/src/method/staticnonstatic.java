package method;

public class staticnonstatic {
	
	static int a=10;		//static variable
		   int b=20;				//nonstatic variable
	
	staticnonstatic(){		//user define method zero argument
		a=12;
		b=22;
	}
	
	staticnonstatic(int a){		//user define with arg
		a=13;
		b=14;
		
	}
	staticnonstatic(char s)	{		//user define with arg
	a=56;
}
	public static void main(String[] args) {
		System.out.println(a);
		
		staticnonstatic x = new staticnonstatic();		//calling constuctor
		System.out.println(a);
		System.out.println(x.b);	
		
		staticnonstatic y = new staticnonstatic(89);	//calling constructor
		System.out.println(y.a);
		System.out.println(y.b);
		
		staticnonstatic z = new staticnonstatic('$');	//calling constructor
				System.out.println(z.a);
				System.out.println(z.b);
		
	} 
}
