import java.util.Scanner;

public class ArrayDemo8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("상품 개수 : ");
		int cnt_product = sc.nextInt();
		sc.nextLine();
		
		Product[] pro = new Product[cnt_product];
		
//		for(int i = 0; i < pro.length; i++) {
//			pro[i] = new Product();
//		}
//		
		
		for(Product p : pro) {
			p = new Product();
			System.out.print("상품명 입력 : ");
			p.name = sc.nextLine();
			System.out.print("상품가격 입력 : ");
			p.price = sc.nextInt();
			sc.nextLine();
			System.out.print("상품색상 입력 : ");
			p.color = sc.nextLine();
			p.display();
		}
//		
//		for(int i = 0; i < pro.length; i++) {
//			pro[i].display();
//		}
	}
}
