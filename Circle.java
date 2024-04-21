package main;

import java.text.DecimalFormat;

public class Circle {
	
	DecimalFormat a = new DecimalFormat("0.####");
	
	private double radius;
	private String color;
	private double area;
	
	public Circle(){
		radius = 2.0;
		color = "Green";
	}
	public Circle(double r, String c) {
		radius = r;
		color = c;
	}
	public void setRadius(double r) {
		radius = r;
	}
	public void setColor(String c) {
		color = c;
	}
	public double getRadius() {
		return radius;
	}
	public String getColor() {
		return color;
	}
	public String calculateArea() {
		area = Math.PI * Math.pow(radius, 2);
		return a.format(area);
	}
	public String getPerimeter() {
		double perimeter = 2 * radius * Math.PI;
		return a.format(perimeter);
	}
}
