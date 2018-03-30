
import java.util.Scanner;

public class Array2DTest06 {
	public static void main(String[] arg) {
		Scanner sc= new Scanner(System.in);
		int[][] a = new int[4][5];
	/*
	int[] [] a = new int[3][4]; 는 아래와 같이 쓸 수 있음
	int[][] a;
	a[0]= new int[4];
	a[1]= new int[4];
	a[2]= new int[4];
	*/
		String retry = null;
		System.out.println("***운수 테스트 프로그램***");
		
		
		
		do {
			
			System.out.println("행운의 수 입력(1~45) : ");
			int n = sc.nextInt();
			//2차원 배열에 난수를 생성해서 대입
			for(int i=0; i<a.length; i++) {
				for(int j= 0; j<a[i].length; j++) {
					a[i][j] = (int)(Math.random()*45) +1;
				}
			}
			
			//2차원 배열의 값을 출력//행운의 수와 2차원 배열의 값(난수)를 비교
			int count = 0;
			for(int i=0; i<a.length; i++) {
				for(int j=0; j<a[i].length; j++) {
					if(n == a[i][j]) {
						++count;
						System.out.printf("%5d", a[i][j] );//err붙이니까 글자색바뀜 대신 글자 순서가 엉망이됌;;
					}else {
					System.out.printf("%5d", a[i][j] );
					}
				}
				System.out.println();
			}
			
			

			//결과를 판정하여 출력하는 부분
			switch(count) {
				case 0:
					System.out.println("보통입니다.");
					break;
				case 1:
					System.out.println("괜찮은 날입니다.");
					break;
				case 2:
					System.out.println("운이 좋은 날입니다.");
					break;
				case 3:
					System.out.println("운수 대통인 날입니다.");
					break;
				case 4:
					System.out.println("대박인 날입니다.");
					break;
				default:
					System.out.println("울트라 헐 짱 대박인 날입니다.");
					break;
			}
			
			System.out.println("맞추신 갯수는: " + count + "개입니다.");
			System.out.println("한번더 하시겠습니까?(y/n)");
			retry= sc.next();
		}while(retry.equalsIgnoreCase("y"));
		
	/*	내가한거
	 	int[][] a = new int[4][5];
		String retry;
		
		do {
			System.out.println("행운의 수(1~45) : ");
			
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
				System.out.println("보통입니다.");
				break;
			case 1:
				System.out.println("괜찮은 날입니다.");
				break;
			case 2:
				System.out.println("운이 좋은 날입니다.");
				break;
			case 3:
				System.out.println("운수 대통인 날입니다.");
				break;
			case 4:
				System.out.println("대박인 날입니다.");
				break;
			
			}
			
			if(c>5) {System.out.println("킹왕짱");}		
			System.out.print("한번 더 하시겠습니까?(y/n)");
			retry = sc.next();
		}while(retry.equalsIgnoreCase("y"));
		
		*/
		
		
		
		
		sc.close();
		
	}
}
