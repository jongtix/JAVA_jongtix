package p01.operations;
/**
 * 복합대입연산자
 */
public class OperExample8 {
	public static void main(String[] args) {
		//로컬변수
		int result = 0;
		result += 10; //result = result + 10 //기존 result값에 10을 더한 결과를 다시 result에 대입
		System.out.println("result = " + result);
		result -= 5; //result = result - 5 //앞의 result값에 5를 뺀 결과를 다시 result에 대입
		System.out.println("result = " + result);
		result *= 3; //result = result * 3 //앞의 result값에 3을 곱한 결과를 다시 result에 대입
		System.out.println("result = " + result);
		result /= 5; //result = result / 5 //앞의 result값에 5를 나눈 결과를 다시 result에 대입
		System.out.println("result = " + result);
		result %= 3; //result = result % 3 //앞의 result값에서 3을 나눈 나머지를 다시 result에 대입
		System.out.println("result = " + result);
	}
}
