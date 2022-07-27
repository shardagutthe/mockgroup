package STRING;

public class splitjoin {
		
		public static void main(String[] args) {
			String s1 = "VELOCITY";
			String s2 = "is";
			String s3 = "BEST";
			
			String[] a = s1.split("T");	//syntax
			for(int i=0;i<a.length;i++) {
				System.out.println(a[i]);
			}
			String[] result1 = s2.split(" ");
			for(int i=0;i<result1.length;i++) {
				System.out.println(result1[i]);
			
			
			
			//String b = String.join(s2,s1,s3);//1st String join karel samorchya 2 string la
			//System.out.println(b);
			
		}

	}
	}


