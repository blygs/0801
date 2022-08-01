
public class ArrayDemo3 {
	public static void main(String[] args) {
		// 배열의 초기값
		// 1. 정수형
		int[] array = new int[4];		// 0으로 초기화
		for(int i = 0; i < array.length; i++) {
			System.out.println("array["+i+"] = " + array[i]);
		}
		
		// 2. 실수형
		double[] doubleArray = new double[4];		// 0.0으로 초기화
		for(int i = 0; i < doubleArray.length; i++) {
			System.out.println("doubleArray["+i+"] = " + doubleArray[i]);
		}
		
		// 3. 문자형
		char[] charArray = new char[4];		// ASCII 0 (\0 or /u0000) 으로 초기화
		for(int i = 0; i < charArray.length; i++) {
			System.out.println("charArray["+i+"] = " + charArray[i]);
		}
		
		// 4. boolean 형
		boolean[] booleanArray = new boolean[4];		// false로 초기화
		for(int i = 0; i < booleanArray.length; i++) {
			System.out.println("booleanArray["+ i +"] = " + booleanArray[i]);
		}
		
		// 5. 참조형
		String[] stringArray = new String[4];		// null 번지로 초기화
		for(int i = 0; i < stringArray.length; i++) {
			System.out.println("stringArray["+ i +"] = " + stringArray[i]);
		}
	}
}
