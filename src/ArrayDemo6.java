import java.util.Scanner;

public class ArrayDemo6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student jimin = new Student();
		
		System.out.print("name : ");
		jimin.name = sc.nextLine();
		
		System.out.print("hackbun : ");
		jimin.hackbun = sc.nextLine();
		
		System.out.print("Korean : ");
		jimin.kor = sc.nextInt();
		
		System.out.print("English : ");
		jimin.eng = sc.nextInt();
		
		System.out.print("Math : ");
		jimin.mat = sc.nextInt();
		
		jimin.calcTot();
		jimin.calcAvg();
		jimin.calcGrade();
		jimin.display();
	}
}
