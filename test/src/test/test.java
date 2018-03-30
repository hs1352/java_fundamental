package test;

import java.util.Scanner;

public class test {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("±¸±¸´Ü: ");
		
		int num =sc.nextInt();
		for(int i=2; i<= num; i++) {	
			A(i);
		}
		
		for(int i=0;i<num;i++) {
		B(i);
		System.out.println("");
		}
		
		sc.close();
	}
	public static void A(int i) {
		for(int j=1; j<=9; j++) {
			System.out.println( i + "*" + j + "=" + i * j );
		}
	}
	
	public static void B(int i) {
		for(int j=0; j<=i;j++) {
			System.out.print("* ");
		}
		
	}
	
	
	
	
	
}
