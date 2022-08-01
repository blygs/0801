import java.util.Scanner;

//1. 숫자를 입력받고 소인수 분해고 3개의 출력마다 줄 바꾸기
public class HomeWork1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("소인수 분해를 진행할 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num == 1) {
			System.out.println(" 숫자 1은 소인수 분해가 불가능 합니다.");
		}
		else {
			int cnt = 0;
			for(int i = 2; i <= num; i++) {
				// 소수를 먼저 찾는다.
				if(isprime(i)) {
					// 나머지가 0이면
					while(num % i == 0) {
						System.out.print(i + "\t");
						num /= i;
						cnt++;
							
						if(cnt % 3 == 0) System.out.println();
	
					}
				}
			}
		}
	}
	
	static boolean isprime(int num) {
		if(num == 2 || num == 3) {
			return true;
		}
		
		for(int i = 2; i < (num / 2) +1; i++ ) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
