package p05.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Map 콜랙션 <K, V> 형태로 객체를 저장하는 자료구조
 * */
public class HashMapExample {
	public static void main(String[] args) {
		// Map객체 생성
		Map<String, Integer> map = new HashMap<>();
		
		// 객체 저장
		map.put("홍길동", 85);
		map.put("일지매", 90);
		map.put("임꺽정", 80);
		map.put("홍길동", 95); // "홍길동" key에 덮어짐
		map.put("이순신", new Integer(90));
		
		System.out.println("총 저장 된 Entry 수 : " + map.size());
		
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		for (;it.hasNext();) {
			String key = it.next();
			int value = map.get(key);
			System.out.println(key + "\t" + value);
		}
		
		// 특정 위치의 객체 검색
		System.out.println("홍길동 : " + map.get("홍길동"));
		// 특정 위치의 객체 삭제
		map.remove("홍길동");
		System.out.println("총 저장 된 Entry 수 : " + map.size());
		// 객체 전체 삭제
		map.clear();
		System.out.println("총 저장 된 Entry 수 : " + map.size());
	}
}
