class Parent{
	int money = 2000000000;
	
	void apperance() {
		System.out.println("�� ���� �ܸ�");
	}
	
	void character() {
		System.out.println("ȭ���� ����");
	}
	
	int getMoney(){
		return money;
	}
}

class child extends Parent {
	@Override
	void apperance() {
		
		super.apperance();
		System.out.println("��ĥ�� Ű");
	}
	@Override //Annotation
	void character() {
		System.out.println("�����Ѽ���");//�������̵�
		/*�޼ҵ��� ������
		  �θ�Ŭ������ �޼ҵ带 �ڽ�Ŭ�������� ������ �ϴ� ��
		  �ڽ�Ŭ�������� �������̵��ϴ� �޼ҵ�� �θ�Ŭ������ �޼ҵ�� ������ ��ġ�ؾ� �Ѵ�.
		 */
	}
}


public class InheritanceTest {
	public static void main(String[] args) {
	
		child boy = new child();
		boy.apperance();
		boy.character();
		
		
		System.out.println("����� " + boy.money + "�� �������ֽ��ϴ�.");
	}
}
