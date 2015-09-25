package kr.ac.kookmin.shape;

import java.util.LinkedList;

public class Test {
	static void paintShapes(Graphics g, LinkedList<Shape> shapes) {
		for(Shape s : shapes) {
			s.draw(g);
		}
	}

	public static void main(String args[]) {
		Rectangle rectangle = new Rectangle(new Point(1, 1), 5, 3);
		Ellipse ellipse = new Ellipse(new Point(2, 2), 3, 2);
		
		LinkedList<Shape> shapes = new LinkedList<Shape>();
		shapes.add(rectangle);
		shapes.add(ellipse);
		
		Graphics g = new Graphics();
		paintShapes(g, shapes);
	}
}

/*
 	Ãâ·Â°ª
Rectangle's bounds is width : 5, height : 3
Center is 1, 1
Ellipse's bounds is width : 6, height : 4
Center is 2, 2
*/