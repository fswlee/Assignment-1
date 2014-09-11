// Florence Lee (fswlee)

package calc;

public class ComplexCalculator {

	private double currentNumber;
	
	// constructor
	public ComplexCalculator(double d) {
		currentNumber = d;
	}
	
	// adds d to current number
	public void add(double d) {
		currentNumber = currentNumber + d;
	}
	
	// subtract()
	public void subtract(double d) {
		currentNumber = currentNumber - d;
	}  
	
	// multiply()
	public void multiply(double d) {
		currentNumber = currentNumber * d;
	}
	
	// divide()
	public void divide(double d) {
		currentNumber = currentNumber / d;
	}
	
	// clear()
	public void clear() {
		currentNumber = 0;
	}
	
	// power()
	public void power(double d) {
		double base = currentNumber;
		for(int i = 1; i < d; i++) {
			currentNumber = base * currentNumber;
		}
	}	
	
	
	public double getCurrentNumber() {
		return currentNumber;
	}
	
	//////////////////////////////////////////////////
	// EXTRA FUNCTIONS - not needed for full credit //
	
	// isEven()
	public boolean isEven() {
		if ( currentNumber % 2 == 0 ) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	// isPrime()
	public boolean isPrime() {
		// if current number is divisible by 2
		if (currentNumber % 2 == 0 ) {  
			return false;
		}
		else {
			// loop through all numbers smaller than currentNumber 
			// and divide it by all the numbers smaller than it starting with 3
			for (double i = 3; i < currentNumber; i ++) {
				if (currentNumber % i == 0)
					return false;
			}
		}
		return true;
	}

	
	
	////////////////////////////////////////////////////
	
}
