
public class MemberCall11 {
	int iv = 10;
	static int cv = 20;
	//å����281
	int iv2 = cv;
	//static int cv2 = iv;
	
	static int cv2 = new MemberCall11().iv;//�͸��ν��Ͻ� Ȥ�� ���� �ν��Ͻ� ���������� �������� �ʾұ� ������ �ѹ��� ��밡��
			
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




