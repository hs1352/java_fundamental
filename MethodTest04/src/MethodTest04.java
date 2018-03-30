import java.util.Scanner;
//메소드 정의
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
		
		System.out.println("---메소드로 나누어 별표 찍기---");
		System.out.println("정수 입력 : ");
		int n = sc.nextInt();
		
		//방법1 - 메소드로 나누지 않았을 때
		/*
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		*/
		
		//방법2 - 메소드를 사용했을 때
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
