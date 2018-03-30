import java.util.Arrays;

public class Array05 {
	public static void main(String[] args) {
		int[] arr1 = {50, 60, 70, 80, 90};
		int[] arr2 = new int[5];
		
		//1번 배열 복사
		
		for(int i=0; i<arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		
		//2번 배열 복사 System.arraycopy(); 메서드 사용
		System.arraycopy(arr1, 1, arr2, 2, 3);
		
		//2번 방법 
		System.out.print("arr1 배열: ");
		System.out.println(Arrays.toString(arr1));
		System.out.print("arr2 배열: ");
		System.out.println(Arrays.toString(arr2));
		
		/*
		System.out.print("arr1 배열 : ");
		for(int i=0; i<arr1.length; i++) {
			System.out.printf("%5d", arr1[i]);
		}
		System.out.println();
		
		System.out.print("arr2 배열 : ");
		for(int i=0; i<arr2.length; i++) {
			System.out.printf("%5d", arr2[i]);
		}
		System.out.println();
		*/
		
	}
}
