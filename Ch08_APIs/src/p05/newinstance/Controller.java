package p05.newinstance;

import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

public class Controller {
	static private Map<String, Action> map = new HashMap<String, Action>();
	public static void main(String[] args) {
		// command.properties의 정보를 저장할 객체 생성
		Properties props = new Properties();
		File f = new File("src/p05/newinstance/command.propertities");
		try {
			FileReader fis = new FileReader(f); // file로부터 정보를 입력받은 객체
			props.load(fis); // 입력 받은 객체로부터 property 형식으로 값을 저장
			
			// 키가 중복되어 있을 수 있기 때문에 중복을 방지하는 Set에 키들만 다시 저장함.
			// Set 객체는 자료를 중복저장하지 않고, 순서가 없는 저장 객체
			Set keySet = props.keySet();
			// 순서가 없는 객체를 저장한 Set에서 값을 처음부터 끝가지 순화하면서 출력하기 위한 객체 - Iterator
			Iterator keyItor = props.keySet().iterator(); // Iterator는 객체의 처음, 현재, 다음 번지값만 저장
			while(keyItor.hasNext()) {
				String command = (String) keyItor.next();
				String className = props.getProperty(command);
				Class clazz;
				clazz = Class.forName(className);
				Action action = (Action) clazz.newInstance();
				// map에 저장 put(key, value)
				map.put(command, action);
			}
			System.out.println("명령어 입력");
			Scanner scanner = new Scanner(System.in);
			String commandStr = scanner.next();
			Action action = map.get(commandStr);
			action.execute();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
