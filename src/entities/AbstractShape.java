package entities;

import enums.Color;

public abstract class AbstractShape implements Shape {

	private Color color;
	
	public AbstractShape() {
		// TODO Auto-generated constructor stub
	}
	
	public AbstractShape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

}
