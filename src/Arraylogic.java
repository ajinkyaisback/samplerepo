import java.util.Arrays;

public class Arraylogic {

	public static void main(String[] args) {
     int a[]= {1, 2,6,3,4,5};
     int temp =0;
     for(int i=a.length-2;i>=0;i--) {
    	 temp=a[i];
    	 a[i]=a[i+1];
    	 a[i+1]=temp;
    	 
     }
     System.out.println(Arrays.toString(a));
     System.out.println(Arrays.toString(a));
	}

}
