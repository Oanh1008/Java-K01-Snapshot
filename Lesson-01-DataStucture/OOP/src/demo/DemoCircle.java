package demo;

import javax.crypto.Cipher;

import pojo.AbstractCommon;
import pojo.Circle;
import pojo.Point;

public class DemoCircle {
	public static void main(String[] args) {
//		Circle circle = new Circle(0, 0, 5);
//		System.out.println(circle.area());
		
		AbstractCommon a = new Circle();
		
		AbstractCommon b = new Point();
		
		a.paint();
		b.paint();
		b = a;
		b.paint();
	}
}
