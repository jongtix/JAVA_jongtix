package p01.references;
/**
 * 배열의 복사
 * */
public class ArrayCopyExample1 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		int[] b = new int[10]; //길이가 10인 1 차원 배열. 요소들의 값은 0으로 초기화.
		int[] c = new int[10];
		int[] d = new int[10];
		int[] e = new int[10];
		int[] f = new int[10];
		int[] g = new int[10];
		
		//배열 요소들의 값 복사
		//a배열의 요소들을 b배열로 복사하면 복사되지 않은 요소들은 초기값인 0으로 그대로 존재.
		//배열의 각 요소들의 초기값은 기본 데이터 타입은 해당 데이터 타입의 기본값으로 초기화
		//							  참조형 데이터 타입은 null로 초기화.
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i]; //a[i]의 값이 b[i]에 복사
		}
		for (int i = 0; i < b.length; i++) {
			System.out.print("b[" + i + "] = " + b[i] + "\t");
		}
		System.out.println();
		
		//향상된 for문
		for (int i : b) {
			System.out.print(i + "\t");
		}
		System.out.println();
		
		//배열의 복사 System.arraycopy()메소드
		//arraycopy(원본, 시작index, 타겟, 타겟의 시작index, 복사할 길이);
		System.arraycopy(a, 0, c, 0, a.length);
		for (int i : c) {
			System.out.print(i + "\t");
		}
		System.out.println();
		
		//배열의 일부분 복사
		//arraycopy(원본, 시작index, 타겟, 타겟의 시작index, 복사할 길이);
		System.arraycopy(a, 0, d, 2, a.length);
		for (int i : d) {
			System.out.print(i + "\t");
		}
		System.out.println();
		
		System.arraycopy(a, 1, e, 0, a.length - 1);
		for (int i : e) {
			System.out.print(i + "\t");
		}
		System.out.println();
		
		System.arraycopy(a, 1, f, 3, a.length - 1);
		for (int i : f) {
			System.out.print(i + "\t");
		}
		System.out.println();
		//for문을 사용하여 a배열의 1번째 index부터 끝까지의 내용을
		//e배열의 index번호 3부터 시작하는 복사
		for (int i = 0; i < a.length; i++) {
			g[i + 3] = a[i];
		}
		for (int i : g) {
			System.out.print(i + "\t");
		}
	}
}
