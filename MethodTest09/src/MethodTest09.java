import java.util.Arrays;
import java.util.Scanner;

// 1�� ��� - 1���� ã���� �ٷ� �����ϴ� �˻� �޼ҵ�(2�� �˻� �Ұ�)
public class MethodTest09 {
	public static int linearSearch(int[] x, int k) {
		for(int i=0; i<x.length; i++) {
			if(k==x[i]) {
				return i;
			}
		}
	return -1;
} 
	
// 2�� ��� - 2�� �̻��� ã���� ���� ������ �˻� �޼ҵ�
	public static int linearSerch2(int[] x, int k) {
		int count = 0;
		for(int i = 0; i<x.length; i++) {
			if(x[i]==k) {
				System.out.print((i+1) + "��° ");
				++count;
			}
				
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("--- ���� �˻� ���α׷� ---");
		System.out.println("�迭�� ���� �Է�: ");
		int n = sc.nextInt();
		System.out.println("�˻��� �� �Է�: ");
		int key= sc.nextInt();
		
		int[] a=new int[n];
		
		for(int i=0; i<a.length; i++) {
			a[i] = (int)(Math.random()*10)+1;
		}
		
		System.out.println(Arrays.toString(a));
		
		
		
		
	/* 1�� ��� �޼ҵ� Ȱ��
			int findIdx = linearSearch(a, key);
			if(findIdx == -1) {
				System.out.println("�˻��� ���� �������� �ʽ��ϴ�.");
			
			}else {
				System.out.println("�˻��� ���� " + (findIdx+1) + "��° �ֽ��ϴ�.");
				}
	*/
		
	//2����� �޼ҵ� Ȱ��
		int count = linearSerch2(a, key);
		if(count == 0) {
			System.out.println("�˻��� ���� �������� �ʽ��ϴ�.");
		}else {
			System.out.println("�ֽ��ϴ�.\n�˻��� ����" + count + "�� �ֽ��ϴ�.");
		}
			

		
		/* ������ ��
		System.out.println("--- ���� �˻� ���α׷� ---");
		System.out.println("�迭�� ���� �Է�: ");
		int n = sc.nextInt();
		int[] num= new int[n];
		
		for(int i=0; i< num.length; i++) {
			num[i] = (int)(Math.random()*11+1);
		}
		
		
		System.out.println("�˻��� �� �Է�: ");
		n = sc.nextInt();
		
		int count = (int)linearSearch(num, n);
		
		System.out.println( "��� �� : " + count);
		for(int i=0; i< num.length; i++) {
			System.out.print(num[i] + " ");	
		}
		*/
		sc.close();
	}
	/*
	public static int linearSearch(int[] num, int n){
		int user=n;
		int count = 0;
		for(int i=0; i<num.length; i++) {
			if(user == num[i]) {
				count++;
			}
		}
		
		return count;
	}
	*/

}
