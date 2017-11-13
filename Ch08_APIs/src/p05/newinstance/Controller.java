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
			Set keySet = props.keySet();
			Iterator keyItor = props.keySet().iterator();
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
