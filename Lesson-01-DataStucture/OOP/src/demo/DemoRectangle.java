package demo;

import pojo.Rectangle;

public class DemoRectangle {
	// main ctrl space
	public static void main(String[] args) {

		Rectangle rectangle1 = new Rectangle();
		System.out.println(rectangle1);
		// sysout ctrl + space

		System.out.println("----------------------------------------");

		Rectangle rectangle2 = new Rectangle(5, 3);
		System.out.println(rectangle2);
		// set = đặt giá trị vào
		rectangle2.setWidth(6);
		rectangle2.setHeight(5);
		System.out.println(rectangle2);
		// in ra màn hình diện tích của rectangle2
		// diện tích = dài * rộng
		
		// get = lấy giá trị ra
		int area = rectangle2.getWidth() * rectangle2.getHeight();
		System.out.println("Area of rectangle2 = " + area);
		
		System.out.println("----------------------------------------");
		
		Rectangle rectangle3 = new Rectangle(6);
		System.out.println(rectangle3);
		
	}
}
