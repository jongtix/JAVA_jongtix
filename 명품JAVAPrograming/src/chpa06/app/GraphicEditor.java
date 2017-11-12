package chpa06.app;

import chpa06.base.Shape;
import chpa06.derived.Circle;

public class GraphicEditor {
	public static void main(String[] args) {
		Shape shape = new Circle();
		shape.draw();
	}
}
