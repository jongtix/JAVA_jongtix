package p03.methods;
/**
 * 초기화 블럭 {}
 * 		- instance 필드의 초기화
 * 		- static 필드의 초기화 static {}
 * */
public class Tv {
	//필드
	static String company = "samsong";
	static String model = "UHD";
	static String info;
	
	static {
		info = company + model;
	}
}
