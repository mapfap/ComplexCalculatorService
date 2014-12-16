package ku.ske.calculator;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Calculator for complex number
 * @author mapfap
 *
 */
@WebService(serviceName = "calculator")
public class ComplexCalculator {
	
	@WebMethod
	public Complex add(Complex a, Complex b) throws UnluckyException {
		if ( Math.random() < 0.5 ) throw new UnluckyException("Sorry you lose~");
		return a.add(b);
	}
	
	@WebMethod
	public Complex multiply(Complex a, Complex b) {
		return a.multiply(b);
	}
	
}
