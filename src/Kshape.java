package starPattern;

public class Kshape {
/*	A B C D E F 
	A B C D E 
	A B C D 
	A B C 
	A B 
	A 
	A 
	A B 
	A B C 
	A B C D 
	A B C D E 
	A B C D E F  */
	public static void main(String [] args) {
	
		char c=65;
		
		for(int i=1;i<=6;i++) {
	
		for(int j=6;j>=i;j--) {
			
			System.out.print(c+" ");
			c++;
		}
		c=65;
		
		for(int s=1;s<=i;s++) {
			System.out.print(" ");
		}
		System.out.println();
	}
	
char d=65;
		
		for(int i=6;i>=1;i--) {
	
		for(int j=6;j>=i;j--) {
			
			System.out.print(d+" ");
			d++;
		}
		d=65;
		
		for(int s=1;s<=i;s++) {
			System.out.print(" ");
		}
		System.out.println();
	}
	}
}
