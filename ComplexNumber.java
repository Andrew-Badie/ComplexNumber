package coe318.lab2;

/**
 * ComplexNumber models a complex number expressed in rectangular form (real and
 * imaginary parts). It is an <em>immutable</em> object.
 *
 * @author Your Name
 */
public class ComplexNumber {
//Instance variable declarations

    
    private double real;
    private double imaginary;
    
   
    
  
    
    /**
     * Construct a ComplexNumber given its real and imaginary parts.
     *
     * @param re The real component
     * @param im The imaginary component
     */
    public ComplexNumber(double re, double im) {
real = re;
imaginary = im;
    }

    /**
     * Returns the real component.
     *
     * @return the real
     */
    public double getReal() {
        return real;	//A stub: to be fixed
    }

    /**
     * Returns the imaginary component.
     *
     * @return the imaginary
     */
    public double getImaginary() {
        return imaginary;	//A stub: to be fixed
    }

    /**
     * Returns a new ComplexNumber number that is the negative of <em>this</em>.
     * Note: the original ComplexNumber is <b>NOT</b>
     * modified.
     *
     * @return -this
     */
    public ComplexNumber negate() {
       ComplexNumber neg;
        neg = new ComplexNumber(-real,-imaginary);
        return neg; //A stub: to be fixed
    }

    /**
     * Returns a new ComplexNumber that is the sum of <em>this</em>	and
     * <em>z</em>. Note: the	original ComplexNumber is
     * <b>NOT</b> modified.
     *
     * @param z
     * @return this + z
     */
    public ComplexNumber add(ComplexNumber z) {
       
    
     
     double real1 = z.real+real;
     double imag1 = z.imaginary+imaginary;
     
     ComplexNumber b = new ComplexNumber(real1,imag1);
        return (b);

    }

    /**
     * Returns a new ComplexNumber that is the difference of <em>this</em>	and
     * <em>z</em>. Note: the	original ComplexNumber is
     * <b>NOT</b> modified.
     *
     * @param z
     * @return this + z
     */
    public ComplexNumber subtract(ComplexNumber z) {
     
     
     double real2 = real-z.real;
     double imag2 =imaginary-z.imaginary;
     
     ComplexNumber c = new ComplexNumber(real2,imag2);
        return (c);
    }

    /**
     * Returns a new ComplexNumber that is the product of <em>this</em> and
     * <em>z</em>. Note: the original ComplexNumber is
     * <b>NOT</b> modified.
     *
     * @param z
     * @return this * z
     */
    public ComplexNumber multiply(ComplexNumber z) {
         
       double num1=  z.real*real;
       double num2 = z.imaginary*imaginary;
       double num3 = imaginary*z.real;
       double num4 = real*z.imaginary;
       double product1 = num1-num2;
       double product2 = num3+num4;
     
           ComplexNumber d = new ComplexNumber(product1,product2);
        return (d) ;	//A stub: to be fixed
    }

    /**
     * Returns a new ComplexNumber that is the reciprocal of <em>this</em>.
     * Note: the original ComplexNumber is
     * <b>NOT</b> modified.
     *
     * @return 1.0 / this
     */
    public ComplexNumber reciprocal() {
        double product1 = real*real;
        double product2 = imaginary*imaginary;
        double sum1 = product1+product2;
         ComplexNumber e = new ComplexNumber((real/sum1),(-imaginary/sum1) );
        return e;	//A stub: to be fixed
    }

    /**
     * Returns a new ComplexNumber that is
     * <em>this</em> divided by <em>z</em>. Note: the original ComplexNumber is
     * <b>NOT</b> modified.
     *
     * @param z
     * @return this / z
     */
    public ComplexNumber divide(ComplexNumber z) {
       double num1=  z.real*real;
       double num2 = z.imaginary*imaginary;
       double num3 = imaginary*z.real;
       double num4 = real*z.imaginary;
       double sum1 = num1+num2;
       double sum2 = num3-num4;
       double square1 =(z.real)*(z.real);
        double square2 =(z.imaginary)*(z.imaginary);
        double value1 = sum1/(square1+square2);
        double value2 = sum2/(square1+square2);
   
        ComplexNumber L = new ComplexNumber(value1,value2);
        
        
        return L ;	//A stub: to be fixed
    }

    /**
     * Returns a String representation of
     * <em>this</em> in the format:
     * <pre>
     *	real +-(optional) i imaginary
     * </pre> If the imaginary part is zero, only the real part is converted to
     * a String. A "+" or "-" is placed between the real and imaginary parts
     * depending on the the sign of the imagrinary part.
     * <p>
     * Examples:
     * <pre>
     *	..println(new ComplexNumber(0,0); -> "0.0"
     *	..println(new ComplexNumber(1,1); -> "1.0 + i1.0"
     *	..println(new ComplexNumber(1,-1); -> "1.0 - i1.0"
     * </pre>
     *
     * @return the String representation.
     */
    @Override
    public String toString() {
//DO NOT MODIFY THIS CODE!
        String str = "" + this.getReal();
        if (this.getImaginary() == 0.0) {
            return str;
        }
        if (this.getImaginary() > 0) {
            return str + " + i" + this.getImaginary();
        } else {
            return str + " - i" + -this.getImaginary();
        }
    }
}
