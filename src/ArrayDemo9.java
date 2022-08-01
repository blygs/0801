import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArrayDemo9 {
	public static void main(String[] args) {
//		double[] original = { 78.2, 56.9, 43.5 };
//		double[] target = { 172.8, 185.4, 162.9, 150.1 };
//		
//		target[0] = original[1]; // 값 복사
//		
//		target = original;		// 주소 복사
//		
//		for(double d : target) {
//			System.out.println(d);
//		}
		
//		int original = 5;
//		int target = 9;
//		System.out.println("original = " + original + ",  target = " + target);
//		
//		int temp = original;
//		original = target;
//		target = temp;
//		System.out.println("original = " + original + ",  target = " + target);
		
//		Product pencil = new Product();
//		
//		pencil.name = "연필";
//		pencil.price = 200;
//		pencil.color = "balck";
//		
//		Product mouse = new Product();
//		mouse.name = "마우스";
//		mouse.price = 50_000;
//		mouse.color = "silver";
//		
//		Product temp = new Product();
//		
//		temp = pencil;
//		pencil = mouse;
//		mouse = temp;
//		
//		pencil.display();
//		mouse.display();
		
		int[] original = { 4, 6, 2, 3, 5, 8, 9, 3, 1, 4, 6, 8 };
		System.out.println("Before sorting");
		for(int su : original) {
			System.out.printf("%d \t", su);
		}
		
		for(int i = 0; i < original.length - 1; i++) {
			for(int j = 0; j < original.length - 1 - i; j++) {
				
				if(original[j] > original[j + 1]) {
					int temp = original[j];
					original[j] = original[j + 1];
					original[j + 1] = temp;
				}
				
			}
		}
		
		System.out.println("\nAfter sorting");
		for(int su : original) {
			System.out.printf("%d \t", su);
		}
	}
}
