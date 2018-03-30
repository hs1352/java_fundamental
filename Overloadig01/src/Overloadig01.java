import java.util.Scanner;

/*
 오버로딩 (OverLoading)
 메소드의 다중정의
 메소드의 이름은 같지만 매개변수의 개수나 타입을 다르게 정의하는 것
 매개변수의 이름이나 리턴값은 포함되지 않는다. 
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
		
		System.out.println("정수 1번 입력: ");
		int x = sc.nextInt();
		System.out.println("정수 2번 입력: ");
		int y = sc.nextInt();
		System.out.println("정수 3번 입력: ");
		int z = sc.nextInt();
		
		System.out.println("두 개의 정수의 최대값은" +  max(x,y) + "입니다.");
		System.out.println("세 개의 정수의 최대값은" +  max(x,y,z) + "입니다.");
		
		sc.close();
	}
}
