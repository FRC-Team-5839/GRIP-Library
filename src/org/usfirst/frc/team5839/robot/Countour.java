package org.usfirst.frc.team5839.robot;

public class Countour {
	
	private double solidity, height, centerX, centerY, area, width;

	public double getSolidity() {
		return solidity;
	}

	public void setSolidity(double solidity) {
		this.solidity = solidity;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getCenterX() {
		return centerX;
	}

	public void setCenterX(double centerX) {
		this.centerX = centerX;
	}

	public double getCenterY() {
		return centerY;
	}

	public void setCenterY(double centerY) {
		this.centerY = centerY;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public Countour(double solidity, double height, double centerX,
			double centerY, double area, double width) {
		super();
		this.solidity = solidity;
		this.height = height;
		this.centerX = centerX;
		this.centerY = centerY;
		this.area = area;
		this.width = width;
	}
	
	

}
