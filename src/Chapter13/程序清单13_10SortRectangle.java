package Chapter13;

import java.util.Arrays;

public class �����嵥13_10SortRectangle {
	public static void main(String[] args){
		�����嵥13_9ComparableRectangle[] rectangles = {
		new �����嵥13_9ComparableRectangle(3.4,5.4),
		new �����嵥13_9ComparableRectangle(13.24,55.4),
		new �����嵥13_9ComparableRectangle(7.4,35.4),
		new �����嵥13_9ComparableRectangle(1.4,25.4)};
		Arrays.sort(rectangles);
		for(�����嵥13_9ComparableRectangle rectangle: rectangles)
			System.out.println(rectangle + " ");
		System.out.println();
	}
}
