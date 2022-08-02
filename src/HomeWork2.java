
//2. 1~100사이의 숫자중 소수 찾기

public class HomeWork2 {
	public static void main(String[] args) {		
		int cnt = 0;
		for(int i = 1; i <= 100; i++) {
			if(isprime(i)) {
				System.out.print(i + "\t");
				cnt++;
				if(cnt % 3 == 0) {
					System.out.println();
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
