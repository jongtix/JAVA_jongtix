package p01.operations;
/**
 * 증값 연산자: 증가, 감소하는 연산자
 * 증감연산자는 피연산자의 위치(왼쪽/오른쪽)에 따라 증가되는 순서가 달라짐.
 * ex) ++x인 경우: 먼저 1 증가 후의 값이 연산됨.
 * 	   x++인 경우: 이전 값으로 연산 후에 1만큼 증가.
 */
public class OperExample3 {
	public static void main(String[] args) {
		int x = 0, y = 0; //초기값 x = 0, y = 0
		System.out.println(x++); // x값 = 0, 출력 후 x값 = 1
		System.out.println(y++); // y값 = 0, 출력 후 y값 = 1
		System.out.println((x++) + (y++)); // 2
		System.out.println((++x) + (++y)); // 6
		System.out.println(x - y); // 0
		
		x = 0; y = 0;
		System.out.println(x = x + 1);
		System.out.println(y = y + 1);
		System.out.println(x + y);
		System.out.println(x = x + 1);
		System.out.println(y = y + 1);
		System.out.println((x = x + 1) + (y = y + 1));
		
		int family = 150;
		System.out.println("홍길동네 집에는 가족이 " + ++family + "명 산다.");
		
	}
}
