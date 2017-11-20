package p06.objectInputOutputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/**
 * 객체의 직렬화란 - 객체의 필드값들이 직렬화 되는것을 말함.
 * 				   - 객체를 직렬화하여 파일에 저장.
 * 		  역작렬화란 - 파일에 저장되어 있는 필드값들을 클래스(설계도 원본)를 참고해서 새로 객체를 만드는 것
 * 					 - 제외되는 필드는 transient로 선언된 필드, static으로 선언된 필드
 * */
public class SerializableExample {
	public static void main(String[] args) throws Exception {
		File f = new File("c:/temp/Object2.dat");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos); 
		
		ClassA classA = new ClassA();
		classA.field1 = 1;
		classA.field2.field1 = 2;
		classA.field3 = 3; // static => 직렬화에서 제외
		classA.field4 = 4; // transient => 직렬화에서 제외
		oos.writeObject(classA);
		System.out.println("객체 저장 성공");
		oos.flush();
		oos.close();
		fos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
		ClassA v = (ClassA) ois.readObject();
		System.out.println("field1 : " + v.field1);
		System.out.println("field2 : " + v.field2.field1);
		System.out.println("field3 : " + v.field3);
		System.out.println("field4 : " + v.field4);
	}
}
