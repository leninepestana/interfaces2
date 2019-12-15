package entities;

import enums.Color;

public class Rectangle extends Shape {

	private Double width;
	private Double higth;
	
	public Rectangle() {
	}
		
	public Rectangle(Color color, Double width, Double higth) {
		super(color);
		this.width = width;
		this.higth = higth;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHigth() {
		return higth;
	}

	public void setHigth(Double higth) {
		this.higth = higth;
	}

	@Override
	public Double area() {
		// TODO Auto-generated method stub
		return width * higth;
	}

}
