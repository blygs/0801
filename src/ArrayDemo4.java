import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo4 {
	public static void main(String[] args) {
//		Product pencil = new Product();
//		pencil.name = "연필";
//		pencil.price = 200;
//		pencil.color = "black";
//		
//		Product mouse = new Product();
//		mouse.name = "마우스";
//		mouse.price = 50_000;
//		mouse.colorr = "silver";
		
		Product[] array = new Product[3];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = new Product();
		}
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < array.length; i++) {
			array[i].name = sc.nextLine();
			array[i].price = sc.nextInt();
			sc.nextLine();
			array[i].color = sc.nextLine();
		}
		for(int i = 0; i < array.length; i++) {
			System.out.println(i + "번째 물품은 " + array[i].name + "이며, 가격은 : " + array[i].price + "원 이고, 색상은 : " + array[i].color + "입니다.");
		}
	}
}
