
public class MethodText07 {
	
 	static int x = 700;//�������� (global variable)
 	static int y = 900;
	
	public static void main(String[] args) {
		System.out.println("1�� x = " + x);
		
		int x = 800;//��������(local variable)		
		System.out.println("2�� x = " + x);
		
		printx();

	
		System.out.println("4�� x = " + MethodText07.x);
		
		System.out.println("y = " +y);
	}
	
	public static void printx() {
		System.out.println("3�� x = " + x );
	}
	
	
}
