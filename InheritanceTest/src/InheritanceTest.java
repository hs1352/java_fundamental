class Parent{
	int money = 2000000000;
	
	void apperance() {
		System.out.println("잘 생긴 외모");
	}
	
	void character() {
		System.out.println("화통한 성격");
	}
	
	int getMoney(){
		return money;
	}
}

class child extends Parent {
	@Override
	void apperance() {
		
		super.apperance();
		System.out.println("훤칠한 키");
	}
	@Override //Annotation
	void character() {
		System.out.println("차분한성격");//오버라이딩
		/*메소드의 재정의
		  부모클래스의 메소드를 자식클래스에서 재정의 하는 것
		  자식클래스에서 오버라이딩하는 메소드는 부모클레스의 메소드와 완전히 일치해야 한다.
		 */
	}
}


public class InheritanceTest {
	public static void main(String[] args) {
	
		child boy = new child();
		boy.apperance();
		boy.character();
		
		
		System.out.println("재산은 " + boy.money + "을 가지고있습니다.");
	}
}
