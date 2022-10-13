package starPattern;

public class Pyramid2Reverse {

	public static void main(String[] args) {
		
		for(int i=6;i>=1;i--) {
			
			for(int s=5;s>=i;s--) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) {
				if(j==1) {
					System.out.print("*");
				}else {
				System.out.print("**");
				}
			}
			System.out.println();
		}
	
	}

}
