package p02.variables;
/**
 * 변수의 scope
 * - 클래스변수: 전역변수
 * - 전역변수: static변수 + instance변수
 * 		static변수는 메모리의 static(메소드)영역에 로드되고,
 * 		instance변수는 클래스가 instance객체로 만들어져야 사용할 수 있는 변수
 * - 접근: static변수는 클래스명.변수로 접근
 *         instance변수는 new 클래스();로 생성한 instance변수.변수로 접근
 *         
 * - 전역변수는 클래스내에서 모두 사용가능하고,
 *   로컬변수는 해당 로컬블록(메소드 블록, 제어문 블록, 반복문 블록 등)에서만 생성되어 사용되다가,
 *   해당 블록을 벗어나는 순간 메모리에서 사라짐
 **/
public class VariableScopeEx1 {
	//매개변수 없는 default생성자
	VariableScopeEx1() {}
	static int a; //전역변수, static 변수(객체의 생성없이 사용가능)
	int f; //전역변수, instance 변수(반드시 객체를 생성 후 사용가능)
	//매소드
	public static void main(String[] args) {
		int v1 = 15; //로컬변수
		int v2 = 0;
		if(v1 > 10) {
			v2 = v1 - 10;
			System.out.println(v2);
		}
		int v3 = v1 + v2 + 5;
		System.out.println(v3);
		System.out.println(v1);
		System.out.println(VariableScopeEx1.a);//static변수는 객체를 생성하지 않고
											   //클래스명.변수명으로 접근
		VariableScopeEx1 ve = new VariableScopeEx1(); //객체생성
		System.out.println(ve);
		System.out.println(ve.f); //instance변수에 접근하기 위해서는
								  //생성한 객체의 참조변수.변수명으로 접근
	}
}
