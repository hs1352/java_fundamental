
class Tv{
	
	//멤버변수
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
		
		System.out.println("tv1의 색상은 " + tv1.color + "입니다.");
		System.out.println("tv1의 전원은 " + (tv1.power == true? "ON" : "OFF") + " 상태입니다.");
		System.out.println("tv1의 현재채널은 " + tv1.channer + "번 입니다.");
		
		System.out.println("");
		
		Tv tv2 = new Tv();
		
		tv2.color = "BLACK";
		tv2.power();
		tv2.channer = 15;
		tv2.channerUp();
		
		System.out.println("tv2의 색상은 " + tv2.color + "입니다. ");
		System.out.println("tv2의 전원은 " + (tv2.power == true? "ON" : "OFF") + "상태입니다.");
		System.out.println("tv2의 현재채널은" + tv2.channer + "번 입니다.");
		
		// 참조변수의 변경
		
		System.out.println("");
		
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		t2 = t1;// t1의 참조하는 곳을 t2도 참조하게 한다.
		t1.channer = 7;
		
		System.out.println("t1의 채널은 " + t1.channer + "입니다.");
		System.out.println("t1의 채널은 " + t2.channer + "입니다.");
		
	}
}














