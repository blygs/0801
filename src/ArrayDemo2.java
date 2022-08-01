import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo2 {
	public static void main(String[] args) {
//		int[] array = new int[4];
//		
//		Scanner sc = new Scanner(System.in);
//		
//		for(int i = 0; i < 4; i++) {
//			System.out.print(i + "번째 방의 값 : ");
//			array[i] = sc.nextInt();
//		}
//		
//		System.out.println(Arrays.toString(array));
//		
//		for(int i = 0 ; i < 4; i ++) {
//			System.out.printf("array[%d] = %d\n", i, array[i]);
//		}
		
//		Student[] array = new Student[2];		// 주소 null 번지 할당
//		for(int i = 0; i < 2; i++) {
//			array[i] = new Student();
//		}
//		Scanner sc = new Scanner(System.in);
//		for(int i = 0; i < 2; i++) {
//			System.out.print(i+ "번째 학생의 이름은 무엇입니까 : ");
//			array[i].name = sc.nextLine();
//			System.out.print(i + "번쨰 학생의 나이는 몇입니까 : ");
//			array[i].age = sc.nextInt();
//			sc.nextLine();
//		}
//		
//		for(int i = 0; i < 2; i++) {
//			System.out.print(i +"번째 학생의 이름은 " + array[i].name + "이며, 나이는 " + array[i].age + "세 입니다.\n");
//		}
		
		/*
		 * 3. 자판기 프로그램 입력 : 145678 50000원 권 : 2개 10000원 권 : 4개 5000원 권 : 1개 1000원 권 : 0개
		 * 500원 권 : 1개 100원 권 : 1개 .. 1원 권 : 8개
		 */
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("input Money : ");
//		int input = sc.nextInt();
//		
//		int[] money = new int[10];
//		int div1 = 50_000;
//		int div2 = 10_000;
//		for(int i = 0; i< money.length; i++) {
//			if(i % 2 == 0 ) {
//				money[i] = input / div1;
//				System.out.printf("%d원 권 : %d\n", div1, money[i]);
//				input = input % div1;
//				div1 /= 10;
//			}else {
//				money[i] = input / div2;
//				System.out.printf("%d원 권 : %d\n", div2, money[i]);
//				input = input % div2;
//				div2 /= 10;
//			}
//		}
		
		int[] div = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		String ans;
		do{
			System.out.print("input Money : ");
			int input = sc.nextInt();
			sc.nextLine();
			
			int[] money = new int[div.length];
			
			for(int i = 0; i< money.length; i++) {
				money[i] = input / div[i];
				System.out.printf("%d원 권 : %d\n", div[i], money[i]);
				input = input % div[i];
			}
			
			System.out.print("Again? (Y/N) : ");
			ans = sc.nextLine();
			
		}while(ans.equals("y") || ans.equals("Y"));
		System.out.println("끝!!");
	}
}
