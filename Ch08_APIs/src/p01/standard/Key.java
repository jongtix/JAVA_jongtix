package p01.standard;

public class Key {
	// 필드
	public int number;

	// 생성자
	public Key(int number) {
		this.number = number;
	}
	
	// 메소드
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Key) {
			Key key = (Key) obj;
			if (this.number == key.number) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() { // Map의 get 메소드는 객체의 hashCode값을 키로하여 객체를 찾아오는 메소드
							// 키가 되는 객체의 hashCode값을 같게 하려면 객체의 hashCode() {} 메소드를 객체가 가지고 있는 필드의 값의 hash코드값으로 리턴하게 재정의함.
		return number;
	}
}
