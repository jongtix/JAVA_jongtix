package p10.maths;

public class MathExample {
	public static void main(String[] args) {
		int v1 = Math.abs(-5);
		double v2 = Math.abs(-3.14);
		System.out.println("v1 = " + v1 + ", v2 = " + v2);
		
		double v3 = Math.ceil(5.3); // 올림
		double v4 = Math.ceil(-5.3);
		System.out.println("v3 = " + v3 + ", v4 = " + v4);
		
		double v5 = Math.floor(5.3); // 내림
		double v6 = Math.floor(-5.3);
		System.out.println("v5 = " + v5 + ", v6 = " + v6);
		
		int v7 = Math.max(5, 9);
		double v8 = Math.max(5.3, 2.5);
		System.out.println("v7 = " + v7 + ", v8 = " + v8);
		
		double v9 = Math.min(5, 9);
		double v10 = Math.min(5.3, 2.5);
		System.out.println("v9 = " + v9 + ", v10 = " + v10);
		
		double v11 = Math.random();
		System.out.println("v11 = " + v11);
		
		double v12 = Math.rint(5.3); // 가장 가까운 정수
		double v13 = Math.rint(5.8);
		System.out.println("v12 = " + v12 + ", v13 = " + v13);
		
		long v14 = Math.round(5.3); // 반올림
		long v15 = Math.round(5.8);
		System.out.println("v14 = " + v14 + ", v15 = " + v15);
		
		double value = 12.3456;
		// 12.35로 나오게 하려면?
		System.out.println(Math.round(value*100.0)/100.0);
	}
}
