import java.util.Scanner;

public class MethodTest03 {
	
	//�޼ҵ� �Է�
	public static double power(double a, int n) {
		double result = 1;
		
		for(int i=0; i<n; i++) {
			result *=a;
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�Ǽ� �Է� : ");
		double a = sc.nextDouble();
		System.out.println("���� �Է� : ");
		int b = sc.nextInt();
		
		//��� -1 �޼��带 ������� �ʾ�����
		/*
		double result = 1; 
		
		for(int i = 0; i<b; i++) {
			result *= a;//result = result * a;
		}
		
		System.out.println(a + "��" + b + "���� " + result + "�Դϴ�.");
		*/
		
		//�޼��� ���������
		double result = 1;
		result = power(a,b);
		System.out.println(a + "��" + b + "���� " + result + "�Դϴ�.");
		
		
		sc.close();
	}
}
