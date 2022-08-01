
public class ArrayDemo {
	public static void main(String[] args) {
//		int[] array;		// 배열의 선언
//		array = new int[4];		// 배열의 생성 값을 넣지 않으면 0으로 초기화.
//		
//		array[0] = 6;
//		array[1] = 9;
//		array[2] = 12;
//		array[3] = 15;
//		for(int i = 0; i < 4; i++) {
//			System.out.print("arr["+ i +"] = " + array[i] + "\t");
//		}
		
//		double[] weights;	// declaration 선언
//		weights = new double[] {67.9, 78.9, 52.3};	// 생성 및 할당
//		
//		for(int i = 0; i < 3; i ++) {
//			System.out.print("weights[" + i + "] = " + weights[i] + "\t");
//		}
		
		char[] grades = {'A', 'C', 'B', 'B', 'C'};	// 초기화, 	 단점 : 꼭 한 줄에 써야한다. 두줄로 나누면 에러가 난다.
		int i = 0;
		while(i < 5) {
			System.out.print("grades[" + i + "] = " + grades[i] + "\t");
			i++;
		}
	}
}
