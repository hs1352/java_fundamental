import java.util.Arrays;
import java.util.Scanner;

// 1번 방법 - 1개를 찾으면 바로 리턴하는 검색 메소드(2개 검색 불가)
public class MethodTest09 {
	public static int linearSearch(int[] x, int k) {
		for(int i=0; i<x.length; i++) {
			if(k==x[i]) {
				return i;
			}
		}
	return -1;
} 
	
// 2번 방법 - 2개 이상을 찾았을 때도 가능한 검색 메소드
	public static int linearSerch2(int[] x, int k) {
		int count = 0;
		for(int i = 0; i<x.length; i++) {
			if(x[i]==k) {
				System.out.print((i+1) + "번째 ");
				++count;
			}
				
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("--- 선형 검색 프로그램 ---");
		System.out.println("배열의 갯수 입력: ");
		int n = sc.nextInt();
		System.out.println("검색할 값 입력: ");
		int key= sc.nextInt();
		
		int[] a=new int[n];
		
		for(int i=0; i<a.length; i++) {
			a[i] = (int)(Math.random()*10)+1;
		}
		
		System.out.println(Arrays.toString(a));
		
		
		
		
	/* 1번 방법 메소드 활용
			int findIdx = linearSearch(a, key);
			if(findIdx == -1) {
				System.out.println("검색한 값은 존재하지 않습니다.");
			
			}else {
				System.out.println("검색한 값은 " + (findIdx+1) + "번째 있습니다.");
				}
	*/
		
	//2번방법 메소드 활용
		int count = linearSerch2(a, key);
		if(count == 0) {
			System.out.println("검색한 값은 존재하지 않습니다.");
		}else {
			System.out.println("있습니다.\n검색한 값이" + count + "게 있습니다.");
		}
			

		
		/* 내가한 것
		System.out.println("--- 선형 검색 프로그램 ---");
		System.out.println("배열의 갯수 입력: ");
		int n = sc.nextInt();
		int[] num= new int[n];
		
		for(int i=0; i< num.length; i++) {
			num[i] = (int)(Math.random()*11+1);
		}
		
		
		System.out.println("검색할 값 입력: ");
		n = sc.nextInt();
		
		int count = (int)linearSearch(num, n);
		
		System.out.println( "결과 값 : " + count);
		for(int i=0; i< num.length; i++) {
			System.out.print(num[i] + " ");	
		}
		*/
		sc.close();
	}
	/*
	public static int linearSearch(int[] num, int n){
		int user=n;
		int count = 0;
		for(int i=0; i<num.length; i++) {
			if(user == num[i]) {
				count++;
			}
		}
		
		return count;
	}
	*/

}
