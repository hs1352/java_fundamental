package test;

import java.util.Arrays;
import java.util.Scanner;


public class test3 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		char[] ch = new char[1];
		
		//System.out.println("한글자 입력: ");
		ch[0]=sc.next().charAt(0);
		
		//System.out.println(Arrays.toString(ch));
	
		int[] num = new int[5];
		
		for(int i=0; i<num.length; i++ ){
			num[i]=(int)(Math.random()*10+1);			
		}
	
		System.out.println(Arrays.toString(ch) + Arrays.toString(num));
		sc.close();
	}
}
