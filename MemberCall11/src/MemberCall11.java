
public class MemberCall11 {
	int iv = 10;
	static int cv = 20;
	//책예제281
	int iv2 = cv;
	//static int cv2 = iv;
	
	static int cv2 = new MemberCall11().iv;//익명인스턴스 혹은 무명 인스턴스 참조변수를 선언하지 않았그 때문에 한번만 사용가능
			
	static void staticMethod1() {
		System.out.println(cv);
		//System.out.println(iv);
		MemberCall11 c = new MemberCall11();
		System.out.println();
		System.out.println(c.iv);
		}
	
	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv);
		}
	
	static void staticMethod2() {
		staticMethod1();
		//instanceMethod1();
		MemberCall11 c = new MemberCall11();
		c.instanceMethod1();
	}
	
	void instanceMethod2() {
		staticMethod1();
		instanceMethod1();
		
	}
	
}




