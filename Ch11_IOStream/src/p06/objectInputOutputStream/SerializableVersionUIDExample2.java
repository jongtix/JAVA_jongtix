package p06.objectInputOutputStream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SerializableVersionUIDExample2 {
	public static void main(String[] args) throws Exception {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("c:/temp/Object3.dat"));
		ClassC classC = (ClassC) ois.readObject();
		System.out.println("field1 : " + classC.field1);
	}
}
