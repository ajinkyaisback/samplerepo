package starPattern;

public class Pyramid1Space {

	public static void main(String[] args) {
		
		for(int i=1;i<=6;i++) {
			
			for(int s=5;s>=i;s--) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}
