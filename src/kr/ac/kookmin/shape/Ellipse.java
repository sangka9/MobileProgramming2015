package kr.ac.kookmin.shape;

public class Ellipse extends Shape {
	private int w;
	private int h;
	
	Ellipse(Point center, int w, int h) {
		this.center=center;
		this.w=w;
		this.h=h;
	}
	
	public Rectangle getBounds() {
		return new Rectangle(center, w*2, h*2);
	}
	
	public int getSemiMajorAxis() {
		return 0;
	}
	
	public int getSemiMinorAxis() {
		return 0;
	}
	
	@Override
	public void draw(Graphics g) {
		g.draw(this);
	}
	
	@Override
	public String toString() {
		return "Ellipse";
	}

	@Override
	public Point getCenter() {
		// TODO Auto-generated method stub
		return this.center;
	}
}