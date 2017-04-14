package Chapter13;

public class �����嵥13_13Rational implements Comparable<�����嵥13_13Rational>{
	  // Data fields for numerator and denominator
	  private long numerator = 0;
	  private long denominator = 1;

	  /** Construct a rational with default properties */
	  public �����嵥13_13Rational() {
	    this(0, 1);
	  }

	  /** Construct a rational with specified numerator and denominator */
	  public �����嵥13_13Rational(long numerator, long denominator) {
	    long gcd = gcd(numerator, denominator);
	    this.numerator = ((denominator > 0) ? 1 : -1) * numerator / gcd;
	    this.denominator = Math.abs(denominator) / gcd;
	  }

	  /** Find GCD of two numbers */
	  private static long gcd(long n, long d) {
	    long n1 = Math.abs(n);
	    long n2 = Math.abs(d);
	    int gcd = 1;
	    
	    for (int k = 1; k <= n1 && k <= n2; k++) {
	      if (n1 % k == 0 && n2 % k == 0) 
	        gcd = k;
	    }

	    return gcd;
	  }

	  /** Return numerator */
	  public long getNumerator() {
	    return numerator;
	  }

	  /** Return denominator */
	  public long getDenominator() {
	    return denominator;
	  }

	  /** Add a rational number to this rational */
	  public �����嵥13_13Rational add(�����嵥13_13Rational secondRational) {
	    long n = numerator * secondRational.getDenominator() +
	      denominator * secondRational.getNumerator();
	    long d = denominator * secondRational.getDenominator();
	    return new �����嵥13_13Rational(n, d);
	  }

	  /** Subtract a rational number from this rational */
	  public �����嵥13_13Rational subtract(�����嵥13_13Rational secondRational) {
	    long n = numerator * secondRational.getDenominator()
	      - denominator * secondRational.getNumerator();
	    long d = denominator * secondRational.getDenominator();
	    return new �����嵥13_13Rational(n, d);
	  }

	  /** Multiply a rational number to this rational */
	  public �����嵥13_13Rational multiply(�����嵥13_13Rational secondRational) {
	    long n = numerator * secondRational.getNumerator();
	    long d = denominator * secondRational.getDenominator();
	    return new �����嵥13_13Rational(n, d);
	  }

	  /** Divide a rational number from this rational */
	  public �����嵥13_13Rational divide(�����嵥13_13Rational secondRational) {
	    long n = numerator * secondRational.getDenominator();
	    long d = denominator * secondRational.numerator;
	    return new �����嵥13_13Rational(n, d);
	  }

	  @Override  
	  public String toString() {
	    if (denominator == 1)
	      return numerator + "";
	    else
	      return numerator + "/" + denominator;
	  }

	  @Override // Override the equals method in the Object class 
	  public boolean equals(Object other) {
	    if ((this.subtract((�����嵥13_13Rational)(other))).getNumerator() == 0)
	      return true;
	    else
	      return false;
	  }

	  public int intValue(){
		  return (int)doubleValue();
	  }
 
	  public float floatValue() {
	    return (float)doubleValue();
	  }

	  public double doubleValue() {
	    return numerator * 1.0 / denominator;
	  }

	  public long longValue() {
	    return (long)doubleValue();
	  }

	  public int compareTo(�����嵥13_13Rational o) {
	    if (this.subtract(o).getNumerator() > 0)
	      return 1;
	    else if (this.subtract(o).getNumerator() < 0)
	      return -1;
	    else
	      return 0;
	  }
}
