import java.util.Scanner;

/*
 �����ε� (OverLoading)
 �޼ҵ��� ��������
 �޼ҵ��� �̸��� ������ �Ű������� ������ Ÿ���� �ٸ��� �����ϴ� ��
 �Ű������� �̸��̳� ���ϰ��� ���Ե��� �ʴ´�. 
 */

public class Overloadig01 {
	public static int max(int a, int b) {
		if(a>b){
			return a;
		}else {
			return b;
		}
	}

	public static int max(int a, int b, int z){
		int max = a;
		if(max < b)max = b;
		if(max <z )max = z;
		return max;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("���� 1�� �Է�: ");
		int x = sc.nextInt();
		System.out.println("���� 2�� �Է�: ");
		int y = sc.nextInt();
		System.out.println("���� 3�� �Է�: ");
		int z = sc.nextInt();
		
		System.out.println("�� ���� ������ �ִ밪��" +  max(x,y) + "�Դϴ�.");
		System.out.println("�� ���� ������ �ִ밪��" +  max(x,y,z) + "�Դϴ�.");
		
		sc.close();
	}
}
