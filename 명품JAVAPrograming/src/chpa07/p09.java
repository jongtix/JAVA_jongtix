package chpa07;

import java.util.Vector;

public class p09 {
	public static void main(String[] args) {
		IStack<Integer> stack = new MyStack<Integer>();
		for (int i = 0; i < 10; i++) stack.push(i);
		while (true) {
			Integer n = stack.pop();
			if (n == null) break;
			System.out.print(n + " ");
		}
	}
}

interface IStack<T> {
	T pop();
	boolean push(T ob);
}

class MyStack<T> implements IStack<T> {
	Vector<T> vec = new Vector<>();
	
	@Override
	public T pop() {
		if (vec.size() == 0) {
			return null;
		} else {
			return vec.remove(0);
		}
	}

	@Override
	public boolean push(T ob) {
		vec.add(0, ob);
		return true;
	}
	
}