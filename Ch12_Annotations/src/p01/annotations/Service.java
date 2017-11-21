package p01.annotations;
/**
 * annotation 적용하기
 * 		- RUNTIME시 특정 기능 자동 실행
 * */
public class Service {
	
	// annotation에 매개값이 없으면 default인 "-"가 15회 출력
	@PrintAnnotation
	public void method1() {
		System.out.println("실행 내용");
	}
	
	// annotation에 매개값이 하나 표시되어 있으면 해당 값으로 15회 출력
	@PrintAnnotation("*")
	public void method2() {
		System.out.println("실행 내용");
	}
	
	// annotation에 매개값이 둘 다 있으면 해당 값으로 해당 횟수 출력
	@PrintAnnotation(value = "#", number = 20)
	public void method3() {
		System.out.println("실행 내용");
	}
}
