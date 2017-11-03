package chap03;

public class p13 {
	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			if (i / 10 == 0) { // 10의 자리가 0일 때
				if (i % 3 == 0) {
					System.out.println(i + " 박수 짝");
				}
			} else { // 10의 자리가 0이 아닐 때
				if ((i / 10) % 3 == 0) { // 10의 자리가 3의 배수
					if (i % 10 == 0 || i % 10 % 3 != 0) { // 1의 자리가 0 or 3의 배수가 아닐 때
						System.out.println(i + " 박수 짝");
					} else { // 1의 자리가 0이 아니고 3의 배수일 때
						System.out.println(i + " 박수 짝짝");
					}
				} else { // 10의 자리가 3의 배수가 아닐 때
					if (i % 10 != 0 && (i % 10) % 3 == 0) { // 1의 자리가 0이 아니고 3의 배수일 때
						System.out.println(i + " 박수 짝");
					}
				}
			}
		}
	}
}
