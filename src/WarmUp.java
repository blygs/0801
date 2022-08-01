/*1. 초를 입력받아서 시와 분과 초로 변환하는 프로그램
	< 입력 >
	계산하실 초 : 
	< 출력 >
	%d 초는 %d 시간 %d 분 %d 초 입니다.
*/
import java.util.Scanner;

public class WarmUp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("계산하실 초 : ");
//		int input_s = sc.nextInt();
//		
//		int hour = input_s / 3600;
//		int sec = input_s % 3600;
//		
//		int min = sec / 60;
//		sec = sec % 60;
//		
//		System.out.printf("%d 초는 %d 시간, %d 분, %d초 입니다.", input_s, hour, min, sec);
		
		System.out.print("시작할 첫 숫자 : ");
		int input_number = sc.nextInt();
		
		System.out.print("n * n 의 n  입력 : ");
		int input_col = sc.nextInt();
		
		for(int i = input_number; i < input_number + input_col; i++) {
			for( int j = i; j < i + input_col; j++){
				System.out.print(j + "\t");
			}
			System.out.println();
		}
	}
}
