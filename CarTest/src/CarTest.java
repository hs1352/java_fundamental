class Car{
	int serialNo;
	String color;
	String gearType;
	int door;
	
	static int count =0;
	//�ν��Ͻ� �ʱ�ȭ
	{	
		serialNo = ++count;		
	}
	Car(){
		//door =2; <--���� )�� �����ڿ��� �ٸ������ڸ� ȣ���Ҷ��� ù�ٿ����� ȣ�� ����
	this("balck","auto",4);		//this()�ڽ��� Ŭ���������� �����ڸ� ȣ��
	//car("balck","auto",4); �� �ȵȴ� �ֳ��ϸ� �����ڴ� new�� ���� �ѹ��� �����Ǿ��ϱ⶧��
	
	//serialNo = ++count;
	}
	//�Ű������� �޴� ������
	Car(String color){
		this(color,"auto",4);
		
		//serialNo = ++count;
	}
	//�Ű������� �޴� ������
	Car(String color, String gearType, int door){
		this.color = color;//this. ��� ���ͽ� �տ� �����Ѵ� ��������
		this.gearType = gearType;
		this.door = door;
		
		//serialNo = ++count;
	}
	//���� ������
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
	
	Car c4 = new Car(c3);//c3�� ���� �ν��Ͻ��� �����.
	System.out.println("c1�� serialIno= " + c1.serialNo + ", c1�� color = " + c1.color + ", gearType= " +
						c1.gearType + ", door= " + c1.door);
	System.out.println("c2�� serialIno= " + c2.serialNo + ", c2�� color = " + c2.color + ", gearType= " +
			c2.gearType + ", door= " + c2.door);
	
	System.out.println("c3�� serialIno= " + c3.serialNo + ", c3�� color = " + c3.color + ", gearType= " +
			c3.gearType + ", door= " + c3.door);
	System.out.println("c4�� serialIno= " + c4.serialNo + ", c4�� color = " + c4.color + ", gearType= " +
			c4.gearType + ", door= " + c4.door);
		
	}
}
