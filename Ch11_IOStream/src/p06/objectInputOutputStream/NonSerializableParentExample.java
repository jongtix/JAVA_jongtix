package p06.objectInputOutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class NonSerializableParentExample {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("c:/temp/Object4.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		// 파일에 저장할 자식 객체 생성
		Child child = new Child();
		child.field1 = "홍길동"; // 부모 필드에서 상속 받은 필드
		child.field2 = "일지매"; // 자식 클래스에서 추가된 필드
		oos.writeObject(child); // 파일에 객체 저장
		oos.flush();
		oos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream("c:/temp/Object4.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Child v = (Child) ois.readObject();
		
		System.out.println("field1 : " + v.field1);
		System.out.println("field2 : " + v.field2);
		ois.close();
		fis.close();
	}
}
