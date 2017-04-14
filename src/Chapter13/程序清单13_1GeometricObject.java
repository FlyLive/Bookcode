package Chapter13;

import java.util.Date;

public abstract class 程序清单13_1GeometricObject {
	private String color = "white";
	private boolean filled;

	private Date datecreated;
	
	public 程序清单13_1GeometricObject(){
		datecreated = new Date();
	}
	
	public 程序清单13_1GeometricObject(String color,boolean filled){
		datecreated = new Date();
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public Date getDateCreated() {
		return datecreated;
	}
	
	@Override
	public String toString(){
		return "created on " + datecreated + "\ncolor:" + color +
			" and filled " + filled;
	}
	
	public abstract double getArea();
	
	public abstract double getPerimeter();
}
