import java.util.Arrays;
import  java.util.Scanner;

public class BubbleSort02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("배열의 갯수 입력: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for(int i=0; i<a.length;i++) {
			a[i] =(int) (Math.random()*100); //0~99사이의 난수
			for(int j=0; j<i; j++) {
				if(a[i] == a[j]) {
					i--;
					break;
				}
			}
		}
		System.out.print("버블정렬 전 : ");
		System.out.println(Arrays.toString(a));
		
		for(int i=0;i<a.length-1;i++) {
			boolean checked = false;
			for(int j=0; j<a.length-1-i; j++) {
				if(a[j]<a[j+1]) {
					int t = a[j];
					a[j]=a[j+1];
					a[j+1] = t;
					checked = true;
				}
			}
			System.out.print(" " + (i+1) + "회전 후 :");
			System.out.println(Arrays.toString(a));
			if(!checked) break;
		}
		System.out.print("버블정렬 후 :");
		System.out.print(Arrays.toString(a));
		
		sc.close();
		}
}
