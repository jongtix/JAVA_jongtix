package chpa05;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Dictionary extends PairMap {
	
	public Dictionary(int number) {
		keyArray = new String[number];
		valueArray = new String[number];
	}

	@Override
	String get(String key) { // key 값을 가진 value 리턴 없으면 null 리턴
		for (int i = 0; i < keyArray.length; i++) {
			if (Arrays.asList(keyArray).contains(key)) {
				return valueArray[Arrays.asList(keyArray).indexOf(key)];
			}
		}
		return null;
	}

	@Override
	void put(String key, String value) { // key와 value를 쌍으로 저장. 기존에 key가 있으면, 값을 value로 수정
		if (Arrays.asList(keyArray).contains(key)) {
				valueArray[Arrays.asList(keyArray).indexOf(key)] = value;
		} else {
			int length = length();
			keyArray[length] = key;
			valueArray[length] = value;
		}
	}

	@Override
	String delete(String key) { // key 값을 가진 아이템(value와 함께) 삭제. 삭제된 value 값 리턴
		if (Arrays.asList(keyArray).contains(key)) {
			int index = Arrays.asList(keyArray).indexOf(key);
			keyArray[index] = null;
			valueArray[index] = null;
			return valueArray[index];
		}
		return null;
	}

	@Override
	int length() { // 현재 저장된 아이템의 개수 리턴
		int cnt = 0;
		for (int i = 0; i < keyArray.length; i++) {
			if (keyArray[i] != null) {
				cnt++;
			}
		}
		return cnt;
	}

}

abstract class PairMap {
	protected String [] keyArray;
	protected String [] valueArray;

	abstract String get(String key);

	abstract void put(String key, String value);

	abstract String delete(String key);

	abstract int length();
}