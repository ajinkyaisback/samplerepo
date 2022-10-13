package starPattern;

public class PatternDiamond {

	public void diamond() {
		for(int i=0; i<=6;i++) {
			
			for(int s=5;s>=i;s--) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
			
}
	public void d1() {
		for(int i=5; i>=0;i--) {
			
			for(int s=5;s>=i;s--) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		PatternDiamond pd= new PatternDiamond();
		pd.diamond();
		pd.d1();
	}
}