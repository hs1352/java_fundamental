import java.util.Arrays;
import java.util.Scanner;

public class MethodTest10 {
	
	public static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2]= t;
	}
	
	public static void reverse(int[] a){
		for(int i=0; i<a.length/2;i++) {
			swap(a, i, a.length-1-i);
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("--- 배열의 값을 거꾸로 넣는 프로그램 ---");
		System.out.print("배열의 갯수 입력: ");
		int n= sc.nextInt();
		
		int[]a= new int[n];
		for(int i=0; i<a.length;i++) {
			a[i]=(int)(Math.random()*10)+1;
		}
		System.out.print("reverse 전 : ");
		System.out.println(Arrays.toString(a));
		
		
		//배열의 값을 거꾸로 넣는 반복문
		//1번방법 - 메소드를 사용하지 않을때
		/*for(int i=0; i<a.length/2;i++) {
			int t= a[i];
			a[i]=a[a.length-1-i];
			a[a.length-1-i]= t;
		}*/
		//2번 방법 - 메소드를 사용할때    메소드안에 출력문이 없음에도 리턴값이없음
		reverse(a);
		System.out.print("reverse 후 : ");
		System.out.println(Arrays.toString(a));
		sc.close();
		
		
		/* 내가 한것
		int num[] = new int[10];
		
		for(int i=0; i<10; i++) {
			num[i]= (int)(Math.random()*10)+1;
		}
		System.out.println(Arrays.toString(num));
		
		change(num);
		
		System.out.println(Arrays.toString(num));
	}
	
	public static int[] change(int[] num) {
		int a=0;
		for(int i=0; i<num.length; i++) {
			a=num[i];
			num[i] = num[num.length - i -1];
			num[num.length - i - 1]= a;
			
			if(i==4) break;
			
		}
		
		
		return num;
	}
	*/
	}
}
