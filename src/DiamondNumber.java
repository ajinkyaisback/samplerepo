

public class DiamondNumber {
	
/*	   1
	  212
	 32123
	4321234
	 32123
	  212
	   1     */

	public static void main(String[] args) {
	
		  
		        for (int i = 1; i <= 4; i++)
		        {
		        	for (int s = 3; s>=i; s--) {
		            	System.out.print(" "); 
		            	} 
		            for (int k = i; k >= 1; k--)
		            {
		                System.out.print(k);
		            }
		            for (int l = 2; l <= i; l++) 
		            { System.out.print(l); 
		            } 
		            System.out.println();
		            }
		        for (int i = 3; i>= 1; i--)
		        {
		        	for (int s = 3; s>=i; s--) {
		            	System.out.print(" "); 
		            	} 
		            for (int k = i; k >= 1; k--)
		            {
		                System.out.print(k);
		            }
		            for (int l = 2; l <= i; l++) 
		            { System.out.print(l); 
		            } 
		            System.out.println();
		            }
	}
}
