package starPattern;

public class EmptyTriangle {

	public static void main(String[] args) {
		
//		 	*
	//	   * *
	//	  *   *
	//	 *     *
	//	*********

	for(int i=1;i<=7;i++) {
		
		for(int s=6;s>=i;s--) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			if(i==7) {
				for(j=1;j<=i;j++) {
					System.out.print(" *");
				}
			}
			if(j==1||j==i) {
			System.out.print(" *");
			}else {
				System.out.print("  ");
			}
		}
		System.out.println();
	}
	
	
	
	}
}
