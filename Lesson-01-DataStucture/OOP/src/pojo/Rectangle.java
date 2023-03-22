package pojo;

// default : extends Object
public class Rectangle {

	// chiều rộng
	private int width;

	// chiều cao;
	private int height;

	// hàm tạo không tham số
	public Rectangle() {
		
	}
	// hàm tạo có tham số
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public Rectangle(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "width = " + this.width + "; height = " + this.height;
		// Rectangle :0x79223 -----> width = 2; height = 30
	}
}
