package p06.objectInputOutputStream;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
/**
 * 일반 클래스를 상속 받은 후 Serializable 구현한 클래스 + 필드 추가
 * */
public class Child extends Parent implements Serializable {
	public String field2; // 직렬화 가능
	
	/**
	 * writeObject() 메소드는 객체 저장 직전에 자동 호출되는 메소드
	 * 		- 이 메소드를 재정의해서 부모의 필드값을 저장
	 * */
	private void writeObject(ObjectOutputStream out) throws IOException {
		out.writeUTF(field1); // 부모 클래스의 String 필드 field1의 값 저장
		out.defaultWriteObject(); // 자식의 필드값 저장
	}
	
	/**
	 * readObject() 메소드는 객체 생성 직전에 자동 호출되는 메소드
	 * 		- 이 메소드를 재정의해서 부모 필드값을 대입
	 * */
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
		field1 = in.readUTF(); // 저장된 String 타입의 부모 필드 field1의 값 읽어 들여서 대입.
		in.defaultReadObject(); // 자식 필드값 읽어들여서 대입
	}
}
