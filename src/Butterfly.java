package starPattern;

public class Butterfly {

	public void part1() {
		
		for(int i=0;i<=5;i++) {
			
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
					for(int s=5;s>i;s--) {
					System.out.print("  ");
					
				}
				for(int k=5;k>i;k-- ) {
					System.out.print("  ");
				}
				for(int l=0;l<=i;l++) {
					System.out.print(" *");
				}
				System.out.println();
			}
	}	
	
	public void part2() {
		
		for(int i=0;i<=4;i++) {
			
			for(int j=4;j>=i;j--) {
				System.out.print("* ");
			}
			for(int s=0;s<=i;s++) {
				System.out.print("  ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("  ");
			}
			for(int l=4;l>=i;l--) {
				System.out.print(" *");
			}
			
			System.out.println();
		}
	}
	

public static void main(String[] args) {
	Butterfly b=new Butterfly();
	b.part1();
	b.part2();
}
}
