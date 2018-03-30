
public class Array2DTest03 {
	public static void main(String[] args) {
		int[][] a;
		a = new int [3][];// 행의 갯수
		a[0] = new int[4];// 첫번째 행의 열의 갯수
		a[1] = new int[5];// 두번째 행의 열의 갯수
		a[2] = new int[4];// 세번째 행의 열의 갯수
		
		
		// 2차원 배열에 두자릿수 난수 생성해서 대입
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length;j++) {
				a[i][j] = (int)(Math.random()* 90) +10;
			}
		}
		
		//2차원 배열 모양으로 출력
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.printf("%5d", a[i][j]);
			}
			System.out.println();
		}
		
		
	}
}
