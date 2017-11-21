package p01.annotations;

import java.lang.reflect.Method;

/**
 * annotation의 적용
 * */
public class PrintAnnotationExample {
	public static void main(String[] args) {
		// Service 클래스로부터 메소드 정보 얻기
		Method [] declaredMethods = Service.class.getDeclaredMethods();
		
		//
		for (Method method : declaredMethods) {
			// Annotation 적용 여부 확인
			if (method.isAnnotationPresent(PrintAnnotation.class)) {
				// PrintAnnotation 정보 얻기
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
				
				// 메소드 이름 출력
				System.out.println("[" + method.getName() + "]");
				
				// 구분선 출력 - PrintAnnotation에 적용된 요소로 출력
				for (int i = 0; i < printAnnotation.number(); i++) {
					System.out.print(printAnnotation.value());
				}
				System.out.println();
				
				try {
					// 메소드 호출
					method.invoke(new Service()); // 인스턴스 메소드 호출
				} catch (Exception e) {
				}
				System.out.println();
			}
		}
	}
}
