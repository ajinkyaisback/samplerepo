

public class EmptyDiamond {

	public static void main(String[] args) {
		
		for(int i=1;i<=7;i++) {
			
			for(int s=6;s>=i;s--) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) {
				if(j==1||j==i) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
				/*if(i==7) {
					for(j=1;j<i;j++) {
						System.out.print(" *");
					}
				}*/
				
			}System.out.println();
		}
		
	for(int i=6;i>=1;i--) {
			
			for(int s=6;s>=i;s--) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) {
				if(j==1||j==i) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
				/*if(i==7) {
					for(j=1;j<i;j++) {
						System.out.print(" *");
					}
				}*/
				
			}System.out.println();
		}
	}
}
