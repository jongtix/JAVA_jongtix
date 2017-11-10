package p01.standard;
/**
 * HashMap<키, 값> 키와 값의 형태로 자료를 저장할 수 있는 객체
 * HashMap에 객체를 저장하는 메소드 put(키, 값); 키(객체), 값(객체)
 * HashMap에서 값을 리턴하는 메소드 get(키); 키에 대응되는 값(객체)를 가져올 수 있음.
 * */
import java.util.HashMap;

public class KeyExample {
	public static void main(String[] args) {
		// 자료 저장용 객체 생성
		HashMap<Key, String> hashMap = new HashMap<>();
		
		Key key = new Key(1);
		hashMap.put(key, "홍길동");
		
		String value = hashMap.get(key);
		System.out.println(value);
	}
}
