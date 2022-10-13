

public class TriangleABCD {

	public static void main(String[] args) {
		
		int c=64;

	for(int i=1;i<=6;i++) {
	
	for(int s=5;s>=i;s--) {
		System.out.print(" ");
	}
	for(int j=1;j<=i;j++) {
		
		System.out.print((char)(c+j)+" ");

	}
	
	System.out.println();
	}
	
	}
	
}
/*		A 
	   A B 
	  A B C 
	 A B C D 
	A B C D E 
   A B C D E F*/