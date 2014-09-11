// Florence Lee (fswlee)

package calc;

public class SimpleCalculator {

	private double currentNumber;
	
	public SimpleCalculator(double d) {
		
		this.currentNumber = d;
		
	}
	
	public void add(double d) {
		
		currentNumber = currentNumber + d;
		
	}
	
	public double getCurrentNumber() {
		
		return currentNumber;
		
	}
	
}
