import java.util.Arrays;

public class SelectionSort01 {
	public static void main(String[] args) {
		 int[] a = new int[] {50, 70, 20, 10, 30};
		 
		 System.out.print("선택 정렬 전 :[");
		 
		
		 for(int i=0; i<a.length; i++) {
			 System.out.print(a[i] + " ");
		 }
		 System.out.println("]");

		 for(int i = 0; i<a.length-1; i++) {
			 for(int j=i+1; j<a.length; j++) {
				 if(a[i] > a [j]) { //부등호바꾸면 오름차순 내림차순 변경 가능
					 int t = a[i];
					 a[i] = a[j];
					 a[j] = t;
				 }
			 }
			 System.out.print(i+1 + "회전 후 :  [");
			 for(int j=0; j<a.length; j++) {
				 System.out.print(a[j] + " ");
			 }
			 System.out.println("]");
		 }
		
		System.out.print("선택 정렬 후 :[");
		for(int i=0; i<a.length; i++){
			System.out.print(a[i] + " ");
		}
		System.out.println("]");
	}

}
