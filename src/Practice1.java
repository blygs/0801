/*
 * 1. 전달 받은 int형 배열에 대해 출력, 합계, 평균, 최대값, 최소값을 구하는 프로그램을 작성하기
 * 배열 = {10, 50, 44, 56, 29, 30, 9, 48, 84, 92 }
 * 
 * <출력>
 * 배열 원본 :
 * 합계 :
 * 평균 :
 * 최대값 : 
 * 최소값 :
 * 
 * */
public class Practice1 {
	public static void main(String[] args) {
		int[] arr = {10, 50, 44, 56, 29, 30, 9, 48, 84, 92 };
		int[] temp_arr = new int[arr.length];
		int min = 987654321, max = 0, tot = 0;
		double avg;
		
		System.out.print("배열 원본 : ");
		printArray(arr);
		
		// 원본을 남겨놓기 위한 복사
		for(int i = 0; i < arr.length; i++) {
			temp_arr[i] = arr[i];
		}
		
		
		//	오름 차순.
		for(int i = 0; i < temp_arr.length -1; i++) {
			for(int j = 0; j < temp_arr.length - 1 - i; j++) {
				if(temp_arr[j] > temp_arr[j + 1]) {
					swap(temp_arr, j);
				}
				
			}
			tot += temp_arr[temp_arr.length-1 -i];
		}
		tot += temp_arr[0];
		
		min = temp_arr[0];
		max = temp_arr[temp_arr.length-1];
		
		System.out.print("오름차순 정렬 후 : \t");
		printArray(temp_arr);
		
		
		
		// 내림차순.
		for(int i = 0; i < temp_arr.length -1; i++) {
			for(int j = 0; j < temp_arr.length - 1 - i; j++) {
				if(temp_arr[j] < temp_arr[j + 1]) {
					swap(temp_arr, j);
				}
				
			}
		}
		
		System.out.print("내림차순 정렬 후 : \t");
		printArray(temp_arr);
		
		
		avg = (double)tot / arr.length;
		
		System.out.println("합계 : " + tot);
		System.out.println("평균 : " + avg);
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
		System.out.print("배열 원본 : ");
		printArray(arr);
	}
	
	
	static void printArray(int[] arr) {
		for(int i : arr) {
			System.out.print(i + "\t ");
		}
		System.out.println();
	}
	
	static void swap(int[] arr, int j) {
		int temp = arr[j];
		arr[j] = arr[j+1];
		arr[j+1] = temp;
	}
}
