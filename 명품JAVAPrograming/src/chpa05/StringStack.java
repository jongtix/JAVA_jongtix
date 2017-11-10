package chpa05;

public class StringStack implements Stack {
	private String [] element;
	private int cnt;
	StringStack(int number) {
		element = new String[number];
	}
	
	@Override
	public int length() {
		cnt = 0;
		for (int i = 0; i < element.length; i++) {
			if (element[i] != null) {
				cnt++;
			}
		}
		return cnt;
	}

	@Override
	public int capacity() {
		return element.length;
	}

	@Override
	public String pop() {
		if (element[0] == null) {
			return null;
		}
		int tos = element.length - 1;
		String str;
		do {
			str = element[tos];
			tos--;
		} while (str != null);
		return str;
	}

	@Override
	public boolean push(String val) {
		if (val.equals("그만")) {
			System.out.print("스택에 저장된 모든 문자열 팝 : ");
			for (int i = 0; i < element.length; i++) {
				System.out.print(element[i] + " ");
			}
			return false;			
		} else if (this.length() == element.length) {
			System.out.println("스택이 꽉 차서 푸시 불가!");
			return true;
		} else {
			element[this.length()] = val;
			return true;
		}
	}

}
