package test1;
import java.util.Scanner;


class diamond{
	void dia() {
		int i=0;
		int num=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("밑변을 입력하세요: ");
		num=sc.nextInt();
		
		top(num);
		
		
		bottom(num);
	}
	
	void top(int num) {
	   int i=0, j=0;
	
	   
	   for(i=0; i<num; i++) {
		   
		   for(j=1; j<num-i; j++) {
			   System.out.printf(" ");		   
		   }
		   
		   for(j=0; j<(i*2)+1; j++) {
			   System.out.printf("*");
		   }
		   System.out.println();
	   }
	   
	}
	
	void bottom(int num) {
		 int i=0, j=0;
			
		   
		   for(i=0; i<num; i++) {
			   for(j=0; j<i+1; j++) {
				   System.out.printf(" ");		   
			   }
			   
			   
			   for(j=1; j<(((num-1)-i)*2); j++) {
				   System.out.printf("*");
			   }
			   System.out.println();
		   }
	}
}




public class test1 {
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		
	
	
	diamond a=new diamond();
	
	
	a.dia();
	
	}
}
