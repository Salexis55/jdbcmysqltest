package threadsandparallelcalculation;

public class Airport {

	private int counter = 0;
	
	
	public void increment() {
		//incrementar el valor de la variable de counter por uno
		counter++;
	}

	public void decrease() {
		//Decrecer el valor de la variable de counter por uno
		counter--;
	}
	
	public int getCounter() {
		return counter;
	}
}
 