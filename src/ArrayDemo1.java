
public class ArrayDemo1 {
	public static void main(String[] args) {
		Student[] array;	// 배열을 선언
		array = new Student[3]; 	// 배열 생성
		
		array[0] = new Student("한지민" , 26);
		
		array[1] = new Student();
		array[1].name = "이영희";
		array[1].age = 27;
		
		array[2] = new Student();
		array[2].name = "김철수";
		array[2].age = 32;
		
		for(int i =0; i < 3; i++) {
			System.out.printf("이름 = %s , 나이 = %d\n", array[i].name, array[i].age);
		}
		
		int sum = 0;
		for(int i = 0; i < 3; i++) {
			sum += array[i].age;
		}
		double avg = sum / 3.0;
		System.out.printf("평균 나이 = %.1f", avg);
	}
}
