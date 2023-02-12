
public class TriangleNum {

	public static void main(String[] args) {
/*		  1
        1   1
      1   2   1
    1   3   3   1
  1   4   4   4   1*/
	
		for(int i=1;i<=5;i++) {
			
			for(int s=4;s>=i;s--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				if(j==1||j==i) {
			System.out.print(" 1");
			}else {
				System.out.print(" "+(i-1));
			}
		}
			System.out.println();
		}
		
	}
}
