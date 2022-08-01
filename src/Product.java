
public class Product {
	String name;
	int price;
	String color;
	
	void display() {
		System.out.printf("이름 = %s\t 가격 = %d\t 컬러 = %s \n",this.name, this.price, this.color);
	}
}


// member variable , member method는 주소로 접근한다.
// 주소는 new 할 때 생긴다.