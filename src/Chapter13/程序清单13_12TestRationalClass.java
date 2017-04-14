package Chapter13;

public class 程序清单13_12TestRationalClass {
	public static void main(String[] args) {
	    // Create and initialize two rational numbers r1 and r2.
	    程序清单13_13Rational r1 = new 程序清单13_13Rational(4, 2);
	    程序清单13_13Rational r2 = new 程序清单13_13Rational(2, 3);

	    // Display results
	    System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
	    System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
	    System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
	    System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
	    System.out.println(r2 + " is " + r2.doubleValue());
	  }
}
