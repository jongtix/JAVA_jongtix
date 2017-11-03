package p03.methods;

public class FinalExample {
	public static void main(String[] args) {
		F1 f1 = new F1(); // instance 생성
		f1.a1 = 15;
//		f1.A2 = 15; // A2는 상수 성격을 가진 필드이므로 더이상 변경불가. 
	}
}
class F1 {
	// 필드
	int a1 = 7; // 변수의 성격을 가진 필드는 소문자 표시
	final int A2 = 10; // 상수의 성격을 가진 필드는 대문자 표시
}