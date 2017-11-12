package chpa05;

import java.util.Scanner;

public class GraphicEditor {
	static Shape [] shape;
	static int index = 0;
	static Scanner scanner = new Scanner(System.in);
	
	public GraphicEditor() {
		shape = new Shape[100];
	}
	
	void insert() {
		System.out.print("Line(1), Rect(2), Circle(3)>>");
		int shapeNumber = scanner.nextInt();
		switch (shapeNumber) {
		case 1:
			shape[index] = new Line();
			index++;
			break;
		case 2:
			shape[index] = new Rect();
			index++;
			break;
		case 3:
			shape[index] = new Circle();
			index++;
			break;
		}
	}
	
	void delete() {
		System.out.println("삭제할 도형의 위치>>");
		int deleteNumber = (scanner.nextInt() - 1);
		if (shape[deleteNumber] == null) {
			System.out.println("삭제할 수 없습니다.");
		} else {
			shape[deleteNumber] = null;
		}
	}
	
	void show() {
		for (int i = 0; i < shape.length; i++) {
			if (shape[i] != null) {
				shape[i].draw();				
			}
		}
	}
	
	public static void main(String[] args) {
		GraphicEditor start = new GraphicEditor();
		System.out.println("그래픽 에디터 beauty을 실행합니다.");
	AA: while (true) {
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
			int check = scanner.nextInt();
			switch (check) {
			case 1:
				start.insert();
				break;
			case 2:
				start.delete();
				break;
			case 3:
				start.show();
				break;
			case 4:
				System.out.println("beauty을 종료합니다.");
				break AA;
			}
		}
	}
}
