package p01.references;
/**
 * 참조변수
 * - 배열, 객체, 인터페이스 등을 참조하는 변수
 * 	 cf.기본 데이터 타입 변수에는 실제값이 저장
 * - 배열은 동일한 타입의 데이터를 묶어서 저장하는 자료구조객체
 * - 사용하기 위해서는 반드시 선언 및 생성 후 사용.
 * - 배열의 길이는 선언시 반드시 지정해주어야함.
 * - 배열의 index범위를 벗어나면 ArrayIndexOutBoundsException 발생.
 * - 배열의 index는 0부터 시작.
 * - 배열의 요소 갯수는 배열변수.length로 구함.
 */
public class ArrExample1 {
	public static void main(String[] args) {
		//배열
		int[] a = null; //배열의 초기값을 null로 초기화, 현재는 참조하는 객체가 없는 상태.
		a = new int [5]; //길이가 5 개인 int 타입의 배열 객체 생성 후 참조변수 a에 객체의 번지를 저장.
		a[0] = 7;
		a[1] = 34;
		a[2] = 67;
		a[3] = 6;
		a[4] = 234;
//		a[5] = 5; 배열의 길이가 고정되어 있고, 그 길이를 넘었기 때문에 오류.
		System.out.println("배열의 갯수 : " + a.length);
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}
}
