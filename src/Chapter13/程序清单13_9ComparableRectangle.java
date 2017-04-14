package Chapter13;

public class 程序清单13_9ComparableRectangle extends 程序清单13_3Rectangle
		implements Comparable<程序清单13_9ComparableRectangle>{
	public 程序清单13_9ComparableRectangle(double width,double height){
		super(width,height);
	}
	
	@Override
	public int compareTo(程序清单13_9ComparableRectangle o){
		if(getArea() > o.getArea())
			return 1;
		else if(getArea() < o.getArea())
			return -1;
		else
			return 0;
	}
	
	public String toString(){
		return super.toString() + " Area:" + getArea();
	}
}
