import java.util.Arrays;

public class BubbleSort01 {
	public static void main(String[] args) {
		int[] a= {50, 70, 20, 10, 30, 55, 66, 88, 22, 44};
		
		System.out.print("�������� ��: ");
		System.out.println(Arrays.toString(a));
		
		for(int i=0; i<a.length-1; i++) {
			boolean checked = false;
			
			for(int j=0; j<a.length-1-i; j++) {
			if(a[j] > a [j+1]) { //�ε�ȣ�ٲٸ� �������� �������� �ٲ�
				int t = a[j];
				a[j] = a[j+1];
				a[j+1] = t;
				checked = true;
				}
			}
			System.out.print(" " + (i+1)+ "ȸ�� �� : ");
			System.out.println(Arrays.toString(a));
			if(!checked) {
				break;
			}
		}
		
		System.out.print("�������� ��: ");
		System.out.println(Arrays.toString(a));
	}
}
