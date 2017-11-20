package p07.inetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;
/**
 * InetAddress 클래스
 * 		- IP주소 정보를 가지는 객체(자신 : local, 상대방 : remote의 주소 정보)
 * */
public class InetAddressExample {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress local = InetAddress.getLocalHost(); // 자신의 주소 정보를 얻는 메소드
		System.out.println("내 컴퓨터 ip 주소 : " + local.getHostAddress()); // ip 주소
		
		InetAddress [] iaArr = InetAddress.getAllByName("www.naver.com"); // 도메인주소로 ip주소 정보를 얻는 메소드
		for (InetAddress remote : iaArr) {
			System.out.println("www.nvaer.com IP주소 : " + remote.getHostAddress());
		}
	}
}
