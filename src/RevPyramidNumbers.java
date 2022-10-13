

public class RevPyramidNumbers {

	public static void main(String[] args) {
		
/*		4321234
		 32123
		  212
		   1    */

		int n=4;
		int o=4;
		for(int i=1;i<=5;i++) {
			
			for(int s=1;s<i;s++) {
				System.out.print(" ");
			}
			
			for(int k=n;k>=1;k--) {
				System.out.print(k);
				
			}
			n--;
			for(int j=2;j<=o;j++)
			{
				System.out.print(j);
			}
			o--;
			
			System.out.println();
		}
		
		
	}
}
