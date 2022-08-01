import java.util.Arrays;

public class ArrayDemo5 {
	public static void main(String[] args) {
		int[] arr = {5,2,7,8,6,9,4};
		
		for(int i : arr) {
			System.out.println("arr =  "+ i);
		}
		
		System.out.println();
		
		Arrays.sort(arr);
		for(int i : arr) {
			System.out.println("arr =  "+ i);
		}
		
	}
}
