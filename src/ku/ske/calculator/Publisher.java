package ku.ske.calculator;

import javax.xml.ws.Endpoint;

public class Publisher {
	
	static String URL = "http://localhost:8080/calculator";
	
	public static void main(String[] args) {
		Endpoint endpoint = Endpoint.create(new ComplexCalculator());
		endpoint.publish(URL);
		System.out.println("service started on " + URL);
	}
	
}
