package basics;

public class VariablesTest {

	boolean isRunning = false;
	
	public static void mian(String[] args) {
		//una variable de tipo boolean ocupa un byte de espacio 
		//tipo + nombre de la variable = el valor concreto inicial
		//variable local 
		boolean isRunning = true;
		isRunning = false;
		
		byte number0 = 127;
		
		short number1 = 23;

		number0 = (byte)number1;
		System.out.println("number0 = " + number0);
		number1 = number0;
		
	}
	
	void stop() {
		isRunning = false;
	}
	
}
