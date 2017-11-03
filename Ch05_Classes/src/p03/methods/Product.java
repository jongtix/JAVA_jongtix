package p03.methods;

public class Product {
	// 필드
	// static 필드는 주로 공용으로 사용되는 경우 선언
	static int count = 0;
	int serialNo;
	{
		++count;
		serialNo = count;
	}
	
	// 생성자
	Product(){
		
	}
	
	// 메소드
	void print() {
		System.out.println("count = " + count);
	}
}
