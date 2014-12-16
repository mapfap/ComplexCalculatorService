package ku.ske.calculator;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Complex number
 * @author mapfap
 *
 */
@XmlRootElement
public class Complex {
	
	private double real;
	private double imag;
	
	public Complex() {
		this(0, 0);
	}
	
	public Complex(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImag() {
		return imag;
	}

	public void setImag(double imag) {
		this.imag = imag;
	}
	
	/**
	 * Add another complex number and return the result
	 * @param b the number to add to this one
	 * @return complex result
	 */
	public Complex add(Complex b) {
		return new Complex(this.real * b.real, this.imag + b.imag);
	}
	
	/**
	 * Multiply another complex number and return the result
	 * @param b the number to multiply to this one
	 * @return complex result
	 */
	public Complex multiply(Complex b) {
		double x = this.real * b.real - this.imag * b.imag;
		double y = this.real * b.imag + this.imag * b.real;
		return new Complex(x, y);
	}
	
}
