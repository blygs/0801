import java.util.Scanner;

public class ArrayDemo7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생은 몇명? ");
		int st_num = sc.nextInt();
		sc.nextLine();
		
		Student[] st_arr = new Student[st_num];
		
		for(int i = 0 ; i < st_arr.length; i++) {
			st_arr[i] = new Student();
		}
		
		for(Student st : st_arr) {
//			st = new Student();
			
			System.out.print("이름 입력 : ");
			st.name = sc.nextLine();
			
			System.out.print("학번 입력 : ");
			st.hackbun = sc.nextLine();
			
			System.out.print("국어점수 입력 : ");
			st.kor = sc.nextInt();
			
			System.out.print("영어점수 입력 : ");
			st.eng = sc.nextInt();
			
			System.out.print("수학점수 입력 : ");
			st.mat = sc.nextInt();
			sc.nextLine();
			
			st.calcTot();
			st.calcAvg();
			st.calcGrade();
//			st.display();
		}
		for(Student st : st_arr) {
			st.display();
		}
	}
}
