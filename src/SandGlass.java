
public class SandGlass {

	public static void main(String[] args) {
		
		for(int i=1;i<=7;i++) {
			
			for(int s=1;s<i;s++) {
				System.out.print(" ");
			}
			for(int j=7;j>=i;j--) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		for(int i=6;i>=1;i--) {
			
			for(int s=1;s<i;s++) {
				System.out.print(" ");
			}
			for(int j=7;j>=i;j--) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
}
