
import java.util.Scanner;

public class Array2DTest06 {
	public static void main(String[] arg) {
		Scanner sc= new Scanner(System.in);
		int[][] a = new int[4][5];
	/*
	int[] [] a = new int[3][4]; �� �Ʒ��� ���� �� �� ����
	int[][] a;
	a[0]= new int[4];
	a[1]= new int[4];
	a[2]= new int[4];
	*/
		String retry = null;
		System.out.println("***��� �׽�Ʈ ���α׷�***");
		
		
		
		do {
			
			System.out.println("����� �� �Է�(1~45) : ");
			int n = sc.nextInt();
			//2���� �迭�� ������ �����ؼ� ����
			for(int i=0; i<a.length; i++) {
				for(int j= 0; j<a[i].length; j++) {
					a[i][j] = (int)(Math.random()*45) +1;
				}
			}
			
			//2���� �迭�� ���� ���//����� ���� 2���� �迭�� ��(����)�� ��
			int count = 0;
			for(int i=0; i<a.length; i++) {
				for(int j=0; j<a[i].length; j++) {
					if(n == a[i][j]) {
						++count;
						System.out.printf("%5d", a[i][j] );//err���̴ϱ� ���ڻ��ٲ� ��� ���� ������ �����̉�;;
					}else {
					System.out.printf("%5d", a[i][j] );
					}
				}
				System.out.println();
			}
			
			

			//����� �����Ͽ� ����ϴ� �κ�
			switch(count) {
				case 0:
					System.out.println("�����Դϴ�.");
					break;
				case 1:
					System.out.println("������ ���Դϴ�.");
					break;
				case 2:
					System.out.println("���� ���� ���Դϴ�.");
					break;
				case 3:
					System.out.println("��� ������ ���Դϴ�.");
					break;
				case 4:
					System.out.println("����� ���Դϴ�.");
					break;
				default:
					System.out.println("��Ʈ�� �� ¯ ����� ���Դϴ�.");
					break;
			}
			
			System.out.println("���߽� ������: " + count + "���Դϴ�.");
			System.out.println("�ѹ��� �Ͻðڽ��ϱ�?(y/n)");
			retry= sc.next();
		}while(retry.equalsIgnoreCase("y"));
		
	/*	�����Ѱ�
	 	int[][] a = new int[4][5];
		String retry;
		
		do {
			System.out.println("����� ��(1~45) : ");
			
			int b = sc.nextInt();
			int c =0;
			
			
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<a[i].length;j++) {
					a[i][j]= (int)(Math.random()*46);
					if(a[i][j] == b ) {c++;}
				}
			}
			
		
		
			switch(c) {
			case 0:
				System.out.println("�����Դϴ�.");
				break;
			case 1:
				System.out.println("������ ���Դϴ�.");
				break;
			case 2:
				System.out.println("���� ���� ���Դϴ�.");
				break;
			case 3:
				System.out.println("��� ������ ���Դϴ�.");
				break;
			case 4:
				System.out.println("����� ���Դϴ�.");
				break;
			
			}
			
			if(c>5) {System.out.println("ŷ��¯");}		
			System.out.print("�ѹ� �� �Ͻðڽ��ϱ�?(y/n)");
			retry = sc.next();
		}while(retry.equalsIgnoreCase("y"));
		
		*/
		
		
		
		
		sc.close();
		
	}
}
