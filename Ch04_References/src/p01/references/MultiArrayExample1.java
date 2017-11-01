package p01.references;
/**
 * 다차원배열(2 차원배열)
 * - 1 차원 배열을 묶어서 하나로 만든 배열
 * - java에서 배열은 반드시 길이를 미리 지정해서 선언해야함.
 * - 값을 저장시 index범위를 벗어나면 오류 발생.
 * - index번호는 반드시 0번부터 시작.
 * */
public class MultiArrayExample1 {
	public static void main(String[] args) {
		//2 차원 배열 객체 생성
		//길이가 3인 1 차원 배열 두 개 합쳐져서 만들어진 2 차원 배열
		//[3] : 1 차원 배열의 길이, [2] : 1 차원 배열 객체의 갯수 
		int[][] a = new int[2][3]; //2행 3열의 2 차원 배열 
								   //2 차원이므로 타입[][] = new 타입[행의 수][열의 수]
		a[0][0] = 7;  a[0][1] = 23; a[0][2] = 11;
		a[1][0] = 27; a[1][1] = 2;  a[1][2] = 13;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
		//향상된 for문을 이용한 출력
		for (int[] i : a) { //2 차원 배열의 반복자변수 선언
							//int[][] a => int[] 변수 : a
			for (int j : i) { //int[] i => int 변수 : i
				System.out.print(j + "\t");
			}
			System.out.println();
		}
	}
}
