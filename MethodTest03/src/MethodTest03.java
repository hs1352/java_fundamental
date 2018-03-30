import java.util.Scanner;

public class MethodTest03 {
	
	//메소드 입력
	public static double power(double a, int n) {
		double result = 1;
		
		for(int i=0; i<n; i++) {
			result *=a;
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("실수 입력 : ");
		double a = sc.nextDouble();
		System.out.println("정수 입력 : ");
		int b = sc.nextInt();
		
		//방법 -1 메서드를 사용하지 않았을때
		/*
		double result = 1; 
		
		for(int i = 0; i<b; i++) {
			result *= a;//result = result * a;
		}
		
		System.out.println(a + "의" + b + "승은 " + result + "입니다.");
		*/
		
		//메서드 사용했을때
		double result = 1;
		result = power(a,b);
		System.out.println(a + "의" + b + "승은 " + result + "입니다.");
		
		
		sc.close();
	}
}
