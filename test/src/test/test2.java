package test;

import java.util.Arrays;
import java.util.Scanner;

class dan{
	static int n =0;
	void dan99(int sc){

		for(int i=2; i<=sc;i++) {
			for(int j=1; j<10; j++) {
				System.out.println(i + " * " + j  +" = " +  i*j );
			} 
			
		}
		dan.n=sc;
	}
	
	static void a(char ch) {
		for(int i=1; i<=dan.n;i++) {
			for(int j=0; j<i;j++) {
			System.out.print(ch + " ");
			}
			System.out.println(" ");
		}
	}
}

public class test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단수 입력: ");
		int num =sc.nextInt();
		
		dan A = new dan();
		A.dan99(num);
		

		System.out.println("기호 입력: ");
	    char ch =sc.next().charAt(0);
		dan.a(ch);
	
		int[] a = new int[3];
		for(int i=0;i<a.length;i++) {
			a[i] = (int)(Math.random()*3);
		}
		
		System.out.println(Arrays.toString(a));
		sc.close();
		
		
	}
}
