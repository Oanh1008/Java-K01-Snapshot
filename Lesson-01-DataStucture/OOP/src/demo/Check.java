package demo;

import java.util.Scanner;

import pojo.Circle;
import pojo.Point;

public class Check {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Point center = new Point(0, 0);

		Circle circle = new Circle(center, 5);

		System.out.print("Enter x: ");
		int x = sc.nextInt();

		System.out.print("Enter y: ");
		int y = sc.nextInt();

		Point point = new Point(x, y);
		
		distanceBetweenCircleAndPoint(circle, point);

	}

	public static void distanceBetweenCircleAndPoint(Circle circle, Point point) {

		double distance = (double) Math.sqrt(Math.pow((point.getX() - circle.getCenter().getX()), 2)
				+ Math.pow(point.getY() - circle.getCenter().getY(), 2));
		
		if (distance > circle.getRadius()) {
			System.out.println("Point is outside the circle");
		} else if (distance ==  circle.getRadius()) {
			System.out.println("Point is in the circle");
		} else {
			System.out.println("Point is inside the circle");
		}

	}
}
