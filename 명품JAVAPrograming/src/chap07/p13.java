package chap07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.Vector;

public class p13 {
	private String name;
	Scanner scanner = new Scanner(System.in);
	Supercom supercom;
	Vector<Supercom> vec = new Vector<>();
	HashMap<String, Integer> memory = new HashMap<>();
	
	p13(String name) {
		this.name = name;
	}
	
	public void readProgramIntoMemory() {
		while (true) {
			System.out.print(">> ");
			String line = scanner.nextLine();
			if (line.toUpperCase().equals("GO")) {
				break;
			}
			vec.add(new Supercom(line));
		}
	}
	
	void clearMemory() {
		vec.removeAllElements();
		memory.clear();
	}
	
	void error(int pc, String msg) {
		System.out.println("프로그램 라인 " + (pc + 1) + "에서 오류. " + msg);
	}
	
	void execute() {
		int pc = 0;
		while (true) {
			Supercom supercom = vec.get(pc);
			pc++;
			switch (supercom.getOpcode()) {
			case "MOV":
				mov(supercom);
				break;
			case "ADD":
				add(supercom);
				break;
			case "SUB":
				sub(supercom);
				break;
			case "JN0":
				int newAddr = jn0(supercom);
				if (newAddr == -1) {
					break;
				} else {
					pc = newAddr;
					break;
				}
			case "PRT":
				prt(supercom);
				break;
			default:
				error(supercom);
				return;
			}
		}
	}
	
	void error(Supercom supercom) {
		System.out.print("명령 오류! ");
		printVariables(supercom);
	}
	
	void printVariables(Supercom supercom) {
		System.out.print(supercom + "\n");
		
		Set<String> s = memory.keySet();
		Iterator<String> it = s.iterator();
		while (it.hasNext()) {
			String variable = it.next();
			int value = memory.get(variable);
			System.out.print(variable + " : " + value + "\t");
		}
		System.out.println();
	}
	
	void prt(Supercom supercom) {
		String first = supercom.getOperand(0);
		
		int n = getValue(first);
		printVariables(supercom);
		System.out.println("출력할 결과는 " + n + ". 프로그램 실행 끝");
	}
	
	int jn0(Supercom supercom) {
		String first = supercom.getOperand(0);
		String second = supercom.getOperand(1);
		
		int n = getValue(first);
		int m = getValue(second);
		if (n != 0) {
			return m;
		} else {
			return -1;
		}
	}
	
	void sub(Supercom supercom) {
		String first = supercom.getOperand(0);
		String second = supercom.getOperand(1);
		
		int n = getValue(first);
		int m = getValue(second);
		memory.put(first, n - m);
	}
	
	void add(Supercom supercom) {
		String first = supercom.getOperand(0);
		String second = supercom.getOperand(1);
		
		int n = getValue(first);
		int m = getValue(second);
		memory.put(first, n + m);
	}
	
	void mov(Supercom supercom) {
		String first = supercom.getOperand(0);
		String second = supercom.getOperand(1);
		
		int m = getValue(second);
		memory.put(first, m);
	}
	
	private int getValue(String opr) {
		int n;
		try { 
			n = Integer.parseInt(opr);
		} catch (NumberFormatException e) {
			Integer value = memory.get(opr);
			if (value == null) {
				memory.put(opr, 0);
				n = 0;
			} else {
				n = value;
			}
		}
		return n;
	}
	
	void run() {
		System.out.println(name + "이 작동합니다. 프로그램을 입력해주세요. GO를 입력하면 작동합니다.");
		while (true) {
			readProgramIntoMemory();
			execute();
			clearMemory();
		}
	}
	
	public static void main(String[] args) {
		p13 m = new p13("수퍼컴");
		m.run();
	}
}

class Supercom {
	private String line;
	private String opcode;
	private String [] operand = new String[2];
	
	public Supercom(String line) {
		this.line = line;
		line = line.toUpperCase();
		StringTokenizer st = new StringTokenizer(line);
		opcode = st.nextToken();
		operand[0] = st.nextToken();
		operand[1] = st.nextToken();
	}

	public String getOpcode() {
		return opcode;
	}
	
	String getOperand(int index) {
		if (index < 0 || index > 2) {
			return null;
		}
		else {
			return operand[index];
		}
	}
	
	@Override
	public String toString() {
		return "[" + line + "] ";
	}
}