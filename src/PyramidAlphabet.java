package starPattern;

public class PyramidAlphabet {

	public static void main(String[] args) {
		
/*		 	 A
		    B B
		   C   C
		  D     D
		 E       E
		F         F
		 E       E
		  D     D
		   C   C
		    B B
		     A   */
		
		char c=65;
		for(int i=1;i<=6;i++) {
			
			for(int s=5;s>=i;s--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				
				if(j==1||j==i) {
				System.out.print(" "+c);
				
				}else {
					System.out.print("  ");
				}
			}c++;
			
			System.out.println();
		}
		char d=69;
for(int i=5;i>=1;i--) {
			
			for(int s=5;s>=i;s--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				
				if(j==1||j==i) {
				System.out.print(" "+d);
				
				}else {
					System.out.print("  ");
				}
			}d--;
			
			System.out.println();
		}
	}
}
