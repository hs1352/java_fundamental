import java.util.Arrays;

public class SelectionSort02 {
	public static void main(String[] args) {
		int[] a = {50, 70, 20, 10, 30};
		
		System.out.print("선택정렬 전 : ");
		System.out.println(Arrays.toString(a));
		
		for(int i=0; i<a.length-1; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i] < a[j]) {
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
 					
				}
			}
			System.out.print(" " + (i+1) + "회전 후  :");
			System.out.println(Arrays.toString(a));
		}
		System.out.print("선택정렬 후: ");
		System.out.println(Arrays.toString(a));
	}
	
}
