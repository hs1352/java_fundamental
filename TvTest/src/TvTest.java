
class Tv{
	
	//�������
	String color;
	boolean power;
	int channer;
	
	void power() {
		power = !power;
	}
	
	void channerUp() {
		++channer;
	}
	
	void channerDown() {
		--channer;
	}
	
}

public class TvTest {
	public static void main(String[] args) {
		//Tv tv1 = new Tv();
		Tv tv1;
		tv1 = new Tv();
		
		tv1.color = "RED";		
		//tv1.power = true;
		tv1.power();
		tv1.channer = 9;
		tv1.channerUp();
		tv1.channerUp();
		
		System.out.println("tv1�� ������ " + tv1.color + "�Դϴ�.");
		System.out.println("tv1�� ������ " + (tv1.power == true? "ON" : "OFF") + " �����Դϴ�.");
		System.out.println("tv1�� ����ä���� " + tv1.channer + "�� �Դϴ�.");
		
		System.out.println("");
		
		Tv tv2 = new Tv();
		
		tv2.color = "BLACK";
		tv2.power();
		tv2.channer = 15;
		tv2.channerUp();
		
		System.out.println("tv2�� ������ " + tv2.color + "�Դϴ�. ");
		System.out.println("tv2�� ������ " + (tv2.power == true? "ON" : "OFF") + "�����Դϴ�.");
		System.out.println("tv2�� ����ä����" + tv2.channer + "�� �Դϴ�.");
		
		// ���������� ����
		
		System.out.println("");
		
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		t2 = t1;// t1�� �����ϴ� ���� t2�� �����ϰ� �Ѵ�.
		t1.channer = 7;
		
		System.out.println("t1�� ä���� " + t1.channer + "�Դϴ�.");
		System.out.println("t1�� ä���� " + t2.channer + "�Դϴ�.");
		
	}
}














