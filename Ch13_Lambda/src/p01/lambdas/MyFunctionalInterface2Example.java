package p01.lambdas;

public class MyFunctionalInterface2Example {
	public static void main(String[] args) {
		MyFunctionalInterface2 fi2 = new MyFunctionalInterface2() {
			
			@Override
			public void method(int x) {
				int result = x * 5;
				System.out.println(result);
			}
		};
		fi2.method(2); // 메소드 호출 2 * 5 = 10 출력
		
		fi2 = (int x) -> {
			int result = x * 5;
			System.out.println(result);
		};
		fi2.method(2);
		
		fi2 = (x) -> {
			System.out.println(x * 5);
		};
		fi2.method(2);
		
		fi2 = x -> System.out.println(x * 5);
		fi2.method(2);
	}
}
