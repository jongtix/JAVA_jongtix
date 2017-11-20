package p06.objectInputOutputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 객체(Number, primitive 타입의 배열, String 등)의 입출력
 * 		- Serializable 인터페이스로 구현되어 있기 때문에 파일에 저장(직렬화)과 파일로부터 읽어들이기(역직렬화)가 가능.
 * */
public class ObjectInputOutputStreamExample {
	public static void main(String[] args) {
		File f = new File("C:/temp/Object.dat");
		FileOutputStream fos;
		ObjectOutputStream oos; // Object를 출력하는 스트림
		ObjectInputStream ois; // Object를 입력하는 스트림
		
		try {
			fos = new FileOutputStream(f);
			oos = new ObjectOutputStream(fos);
			
			// 파일에 객체 기록(객체의 내용 기록)
			oos.writeObject(new Integer(10)); // Wrapper 클래스
			oos.writeObject(new Double(3.14)); // Wrapper 클래스
			oos.writeObject(new int [] { 1, 2, 3 }); // Array 클래스
			oos.writeObject(new String("홍길동")); // String 클래스
			
			oos.flush();
			oos.close();
			fos.close();
			
			// 파일에서 객체 읽기
			ois = new ObjectInputStream(new FileInputStream(f));
			Integer obj1 = (Integer) ois.readObject();
			Double obj2 = (Double) ois.readObject();
			int [] obj3 = (int []) ois.readObject();
			String obj4 = (String) ois.readObject();
			
			ois.close();
			
			System.out.println(obj1);
			System.out.println(obj2);
			for (int i = 0; i < obj3.length; i++) {
				System.out.print(obj3[i] + "\t");
			}
			System.out.println();
			System.out.println(obj4);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
