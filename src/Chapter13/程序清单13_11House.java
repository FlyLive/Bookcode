package Chapter13;

import java.util.Date;

public class �����嵥13_11House
		implements Cloneable,Comparable<�����嵥13_11House>{
	private int id;
	private double area;
	private Date whenBuilt;
	
	public �����嵥13_11House(int id,double area){
		this.id = id;
		this.area = area;
		whenBuilt = new Date();
	}
	
	public int getId(){
		return id;
	}
	
	public double getArea(){
		return area;
	}
	
	public Date getWhenBuilt(){
		return whenBuilt;
	}
	
	@Override
	public Object clone()throws CloneNotSupportedException{
		return super.clone();			//ǳ����
	/*	
		�����嵥13_11House houseClone = (�����嵥13_11House)super.clone();
		houseClone.whenBuilt = (Date)(whenBuilt.clone());
	*/
	}
	
	@Override
	public int compareTo(�����嵥13_11House o){
		if(area > o.area)
			return 1;
		else if(area < o.area)
			return -1;
		else
			return 0;
	}
}
