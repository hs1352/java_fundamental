import java.util.Arrays;

public class BubbleSort01 {
	public static void main(String[] args) {
		int[] a= {50, 70, 20, 10, 30, 55, 66, 88, 22, 44};
		
		System.out.print("버블정렬 전: ");
		System.out.println(Arrays.toString(a));
		
		for(int i=0; i<a.length-1; i++) {
			boolean checked = false;
			
			for(int j=0; j<a.length-1-i; j++) {
			if(a[j] > a [j+1]) { //부등호바꾸면 오름차순 내림차순 바뀜
				int t = a[j];
				a[j] = a[j+1];
				a[j+1] = t;
				checked = true;
				}
			}
			System.out.print(" " + (i+1)+ "회전 후 : ");
			System.out.println(Arrays.toString(a));
			if(!checked) {
				break;
			}
		}
		
		System.out.print("버블정렬 후: ");
		System.out.println(Arrays.toString(a));
	}
}
