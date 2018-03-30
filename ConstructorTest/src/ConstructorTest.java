class Data1{
	int value;
	
	Data1(){
		System.out.println("Data1 생성자");
	}
}

class Data2{
	int value;
	Data2(){
		System.out.println("Data2 생성자1");
	}
	Data2(int x){
		value = x;
		System.out.println("Data2 생성자2 " + x);
	}
}


public class ConstructorTest {	
	public static void main(String[] args){
		Data1 d1 = new Data1();
		Data2 d2 = new Data2(); 
		Data2 d3 = new Data2(10); 
		
		System.out.println("d1.vlaue = ");
		System.out.println();
		//기본생성자가 컴파일러에 의해서 추가되는경우는 클래스에 정의된 생성자가 하나도 없을 때 뿐이다.
	}
}
