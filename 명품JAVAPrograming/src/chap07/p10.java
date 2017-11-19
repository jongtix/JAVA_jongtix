package chap07;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

import chap05.Circle;
import chap05.Line;
import chap05.Rect;
import chap05.Shape;

public class p10 {
	Vector<Shape> vec;
	Scanner scanner = new Scanner(System.in);
	p10() {
		vec = new Vector<>();
	}
	
	void run() {
		System.out.println("그래픽 에디터 beauty을 실행합니다.");
		AA: while (true) {
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>> ");
			int check = scanner.nextInt();
			switch (check) {
			case 1:
				insert();
				break;
			case 2:
				delete();
				break;
			case 3:
				show();
				break;
			case 4:
				System.out.println("beauty을 종료합니다.");
				break AA;
			}
		}
	}
	
	void insert() {
		System.out.print("Line(1), Rect(2), Circle(3)>> ");
		int shapeNumber = scanner.nextInt();
		switch (shapeNumber) {
		case 1:
			vec.add(new Line());
			break;
		case 2:
			vec.add(new Rect());
			break;
		case 3:
			vec.add(new Circle());
			break;
		}
	}
	
	void delete() {
		System.out.println("삭제할 도형의 위치>> ");
		int deleteNumber = (scanner.nextInt() - 1);
		if (deleteNumber >= vec.size()) {
			System.out.println("삭제할 수 없습니다.");
		} else {
			vec.get(deleteNumber).setNext(null);
		}
	}
	
	void show() {
		Iterator<Shape> it = vec.iterator();
		while (it.hasNext()) {
			it.next().draw();
		}
	}
	
	public static void main(String[] args) {
		p10 go = new p10();
		go.run();
	}
}
