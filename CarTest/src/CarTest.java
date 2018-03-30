class Car{
	int serialNo;
	String color;
	String gearType;
	int door;
	
	static int count =0;
	//인스턴스 초기화
	{	
		serialNo = ++count;		
	}
	Car(){
		//door =2; <--에러 )한 생성자에서 다른생성자를 호출할때는 첫줄에서만 호출 가능
	this("balck","auto",4);		//this()자신의 클래스내에서 생성자를 호출
	//car("balck","auto",4); 은 안된다 왜냐하면 생성자는 new를 쓸때 한번만 생성되야하기때문
	
	//serialNo = ++count;
	}
	//매개변수를 받는 생성자
	Car(String color){
		this(color,"auto",4);
		
		//serialNo = ++count;
	}
	//매개변수를 받는 생성자
	Car(String color, String gearType, int door){
		this.color = color;//this. 모든 인터스 앞에 존재한는 참조변수
		this.gearType = gearType;
		this.door = door;
		
		//serialNo = ++count;
	}
	//복사 생성자
	Car(Car c){
		this(c.color,c.gearType,c.door);
	//	this.color = c.color;
	//	this.gearType = c.gearType;
	//	this.door = c.door;
	
	//serialNo = ++count;
	}
	
}

public class CarTest {
	public static void main(String[] args) {
	
	Car c1 = new Car();
	//c1.color = "wite";
	//c1.gearType = "auto";
	//c1.door = 4;
	
	Car c2 = new Car("white", "auto", 4);
	
	Car c3 = new Car("blue");
	
	Car c4 = new Car(c3);//c3와 같은 인스턴스를 만든다.
	System.out.println("c1의 serialIno= " + c1.serialNo + ", c1의 color = " + c1.color + ", gearType= " +
						c1.gearType + ", door= " + c1.door);
	System.out.println("c2의 serialIno= " + c2.serialNo + ", c2의 color = " + c2.color + ", gearType= " +
			c2.gearType + ", door= " + c2.door);
	
	System.out.println("c3의 serialIno= " + c3.serialNo + ", c3의 color = " + c3.color + ", gearType= " +
			c3.gearType + ", door= " + c3.door);
	System.out.println("c4의 serialIno= " + c4.serialNo + ", c4의 color = " + c4.color + ", gearType= " +
			c4.gearType + ", door= " + c4.door);
		
	}
}
