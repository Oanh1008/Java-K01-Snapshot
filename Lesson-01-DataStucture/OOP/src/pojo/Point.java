package pojo;

public class Point extends AbstractCommon{
	
	private int x;
	
	private int y;

	public Point() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	@Override
	public void paint() {
		// TODO Auto-generated method stub
		System.out.println("Point");
		
	}
	
	
}
