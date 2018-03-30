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
		System.out.println("--- �迭�� ���� �Ųٷ� �ִ� ���α׷� ---");
		System.out.print("�迭�� ���� �Է�: ");
		int n= sc.nextInt();
		
		int[]a= new int[n];
		for(int i=0; i<a.length;i++) {
			a[i]=(int)(Math.random()*10)+1;
		}
		System.out.print("reverse �� : ");
		System.out.println(Arrays.toString(a));
		
		
		//�迭�� ���� �Ųٷ� �ִ� �ݺ���
		//1����� - �޼ҵ带 ������� ������
		/*for(int i=0; i<a.length/2;i++) {
			int t= a[i];
			a[i]=a[a.length-1-i];
			a[a.length-1-i]= t;
		}*/
		//2�� ��� - �޼ҵ带 ����Ҷ�    �޼ҵ�ȿ� ��¹��� �������� ���ϰ��̾���
		reverse(a);
		System.out.print("reverse �� : ");
		System.out.println(Arrays.toString(a));
		sc.close();
		
		
		/* ���� �Ѱ�
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
