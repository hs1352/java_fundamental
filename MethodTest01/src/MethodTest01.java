import java.util.Scanner;

public class MethodTest01 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] height = new int[5];
		int[] weight = new int[5];
		int[] age = new int[5];
		
		for(int i=0; i<height.length; i++) {
			System.out.println("--- " + (i+1) + "번째 학생---");
			System.out.print("신장: ");
			height[i] = sc.nextInt();
			System.out.print("체중: ");
			weight[i] = sc.nextInt();
			System.out.print("나이: ");
			age[i] = sc.nextInt();
		}
		
		int maxheight = height[0];
		if(maxheight < height[1]) maxheight = height[1];
		if(maxheight < height[2]) maxheight = height[2];
		if(maxheight < height[3]) maxheight = height[3];
		if(maxheight < height[4]) maxheight = height[4];
		
		int maxweight = weight[0];
		if(maxweight < weight[1]) maxweight = weight[1];
		if(maxweight < weight[2]) maxweight = weight[2];
		if(maxweight < weight[3]) maxweight = weight[3];
		if(maxweight < weight[4]) maxweight = weight[4];
		
		int maxage = age[0];
		if(maxage < age[1]) maxage = age[1];
		if(maxage < age[2]) maxage = age[2];
		if(maxage < age[3]) maxage = age[3];
		if(maxage < age[4]) maxage = age[4];
		
		System.out.println("신장의 최댓값 : " + maxheight);
		System.out.println("체중의 최댓값 : " + maxweight);
		System.out.println("나이의 최댓값 : " + maxage);
		
		
		
		
		
		sc.close();
	
	}
}
