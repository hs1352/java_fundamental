import java.util.Scanner;
//�޼ҵ� ����
public class MethodTest04 {
	
	public static void drawStar(int n) {
		for(int i=1; i<=n; i++) {
		System.out.print("* ");
		}
	}
	
	public static void drawStar2(int n, int scn) {
		for(int i=1; i<= scn - n; i++ ) {
			System.out.print("  ");
			}
		for(int j=1; j<=n; j++) {
			for(int k=2; k<=n; k++) {
				
			}
				System.out.print("* ");
			}
			
	}
	
	public static void drawStar3(int n, int scn) {
		for(int i=1; i<= scn - n; i++ ) {
			System.out.print("  ");
			}
		for(int i= 1; i<=n; i++) {
			System.out.print("* ");
		}
	}
	



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---�޼ҵ�� ������ ��ǥ ���---");
		System.out.println("���� �Է� : ");
		int n = sc.nextInt();
		
		//���1 - �޼ҵ�� ������ �ʾ��� ��
		/*
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		*/
		
		//���2 - �޼ҵ带 ������� ��
		for(int i=1; i<=n; i++) {
			drawStar(i);
			System.out.println(" ");
		}
		
		for(int i=1; i<=n; i++) {
			drawStar2(i,n);
			System.out.println(" ");
		}
		
		for(int i=n; i>=1; i--) {
			drawStar3(i,n);
			System.out.println(" ");
		}
		
	
		sc.close();
	}

	
}
