import java.util.Scanner;

public class Array2DTest02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행 수 입력: ");
		int h = sc.nextInt();
		System.out.print("열 수 입력: ");
		int w = sc.nextInt();
		
		int[][] a = new int[h][w];
		
		for(int i=0; i<h; i++) {
			for(int j=0; j<w; j++) {
				a[i][j] = (int)(Math.random() * 90) + 10;//두자리난수
			}
		}
		
		for(int i=0; i<h; i++) {
			for(int j=0; j<w; j++) {
				System.out.printf("%3d", a[i][j]);
			}
			System.out.println();
		}
		
		
		
		sc.close();
	}
}
