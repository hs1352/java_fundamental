class Data1{
	int value;
	
	Data1(){
		System.out.println("Data1 ������");
	}
}

class Data2{
	int value;
	Data2(){
		System.out.println("Data2 ������1");
	}
	Data2(int x){
		value = x;
		System.out.println("Data2 ������2 " + x);
	}
}


public class ConstructorTest {	
	public static void main(String[] args){
		Data1 d1 = new Data1();
		Data2 d2 = new Data2(); 
		Data2 d3 = new Data2(10); 
		
		System.out.println("d1.vlaue = ");
		System.out.println();
		//�⺻�����ڰ� �����Ϸ��� ���ؼ� �߰��Ǵ°��� Ŭ������ ���ǵ� �����ڰ� �ϳ��� ���� �� ���̴�.
	}
}
