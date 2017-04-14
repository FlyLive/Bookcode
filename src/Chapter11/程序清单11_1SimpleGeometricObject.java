package Chapter11;

import java.util.Date;

public class 程序清单11_1SimpleGeometricObject {
	private String color = "white";
	private boolean filled;
	private Date datecreated;
	
	public 程序清单11_1SimpleGeometricObject(){
		datecreated = new Date();
	}
	
	public 程序清单11_1SimpleGeometricObject(String color,boolean filled){
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

	public String toString(){
		return "created on " + datecreated + "\ncolor:" + color +
			" and filled " + filled;
	}
	
}
