package pojo;

public class Circle {

	private Point center; // Tọa độ tâm
	
	private int radius; // bán kính đường tròn

	public Circle() {
		
	}

	public Circle(Point center, int radius) {
		super();
		this.center = center;
		this.radius = radius;
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [center=" + center + ", radius=" + radius + "]";
	}
	
}
