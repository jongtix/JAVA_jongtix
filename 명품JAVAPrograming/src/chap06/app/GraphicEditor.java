package chap06.app;

import chap06.base.Shape;
import chap06.derived.Circle;

public class GraphicEditor {
	public static void main(String[] args) {
		Shape shape = new Circle();
		shape.draw();
	}
}
