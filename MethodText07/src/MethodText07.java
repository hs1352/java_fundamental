
public class MethodText07 {
	
 	static int x = 700;//전역변수 (global variable)
 	static int y = 900;
	
	public static void main(String[] args) {
		System.out.println("1번 x = " + x);
		
		int x = 800;//지역변수(local variable)		
		System.out.println("2번 x = " + x);
		
		printx();

	
		System.out.println("4번 x = " + MethodText07.x);
		
		System.out.println("y = " +y);
	}
	
	public static void printx() {
		System.out.println("3번 x = " + x );
	}
	
	
}
