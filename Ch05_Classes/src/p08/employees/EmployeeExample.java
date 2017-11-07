package p08.employees;

public class EmployeeExample {
	public static void main(String[] args) {
		// 객체생성
		// 추상 클래스의 배열은 생성 가능
		// new Employee() 객체 생성은 불가능
		Employee[] emp = new Employee[5];
		// 객체의 다형성을 이용한 배열 저장
		// 최상위 타입의 배열을 생성 후 자식 객체들을 대입
		emp[0] = new SalaryMan("홍길동", 200000);
		emp[1] = new SalaryMan("일지매", 500000);
		emp[2] = new HourlyMan("유관순", 10, 7000);
		emp[3] = new HourlyMan("박명수", 2, 7000);
		emp[4] = new SalaryMan("수지", 2000000);
		
		// 반복자를 이용한 향상된 for문
		for (Employee e : emp) { // 배열 내의 요소들이 Promotion된 상태
			e.computeIncentive(); // 보너스 구하기
			e.print(); // 출력
			// 시급인 경우 근무기간과 총시급 구하기
			if (e instanceof HourlyMan) {
				// 자식 객체에서 추가된 메소드는 부모 타입에서 사용 불가.
				// -> 사용하기 위해서는 자식 타입으로 Casting(강제 형변환)
				System.out.print("(" + ((HourlyMan) e).getName() + "님, ");
				System.out.print("근무시간 : " + ((HourlyMan) e).getHour() + "\t");
				System.out.print("시급 : " + ((HourlyMan) e).getPerHour() + ")\n");
			} else {
				
			}
		}
	}
}
