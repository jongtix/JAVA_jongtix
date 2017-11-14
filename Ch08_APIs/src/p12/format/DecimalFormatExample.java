package p12.format;

import java.text.DecimalFormat;

public class DecimalFormatExample {
	public static void main(String[] args) {
		double num = 1234567.89;
		DecimalFormat df = new DecimalFormat("0"); // 정수만 출력
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0.0"); // 소수 첫 번째 자리까지 출력
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0000000000.00000");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#.#");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#############.#####");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#.0");
		System.out.println(df.format(num));
		df = new DecimalFormat("+#.0");
		System.out.println(df.format(num));
		df = new DecimalFormat("-#.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#,###.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0.0E0"); // 부동소수점 표시
		System.out.println(df.format(num));
		
		df = new DecimalFormat("+#,### ; -#,###"); // 양수 || 음수 표시
		System.out.println(df.format(num));
		
		df = new DecimalFormat("##.# %"); // 퍼센트 표시
		System.out.println(df.format(num));
		
		df = new DecimalFormat("\u00A4#,###"); // 원화 표시
		System.out.println(df.format(num));
	}
}
