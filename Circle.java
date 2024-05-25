//override methods
package com.javaconcepts;

public class Circle {

	private double  radius;
	public Circle(double radius)
	{
		super();
		this.radius=radius;
	}
	
	public double getPerimeter()
	{
		return 2*3.14*this.radius;
		
	}
	public double getArea()
	{
		return 3.14*this.radius*this.radius;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle obj=new Circle(3);
		System.out.println("circle perimeter is "+obj.getPerimeter());
		System.out.println("circle area is "+obj.getArea());
		
	}

}
