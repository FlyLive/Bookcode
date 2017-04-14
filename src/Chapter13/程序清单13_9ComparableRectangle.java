package Chapter13;

public class �����嵥13_9ComparableRectangle extends �����嵥13_3Rectangle
		implements Comparable<�����嵥13_9ComparableRectangle>{
	public �����嵥13_9ComparableRectangle(double width,double height){
		super(width,height);
	}
	
	@Override
	public int compareTo(�����嵥13_9ComparableRectangle o){
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
