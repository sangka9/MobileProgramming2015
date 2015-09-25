package kr.ac.kookmin.shape;

public class Rectangle extends Shape {
	private int h;
	private int w;
	
	Rectangle(Point center, int h, int w) {
		this.center=center;
		this.h=h;
		this.w=w;
	}
	
	public Rectangle getBounds() {
		return this;
	}
	
	public int getHeight() {
		return h;
	}
	
	public int getWidth() {
		return w;
	}
	
	@Override
	public void draw(Graphics g) {
		g.draw(this);
	}
	
	@Override
	public String toString() {
		return "Rectangle";
	}

	@Override
	public Point getCenter() {
		// TODO Auto-generated method stub
		return this.center;
	}
}