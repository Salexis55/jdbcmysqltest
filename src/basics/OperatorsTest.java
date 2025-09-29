package basics;

public class OperatorsTest {

	public static void main(String[] args) {
		
		arithmeticOperations();
		
		
	}

	private static void arithmeticOperations() {
		// TODO Auto-generated method stub

		//declaring the variables of the same type
		float num1 = 10, num2 = 20.40f, num3;
		System.out.println(num1);
		num1 = 23.34f;
		System.out.println(num1);
		//suma de las dos variables
		float result = num1 + num2;
		System.out.println("El resultado es " + result);
		
		/**
		 * restas la variable result anterior
		 * 1 La CPU lee el valor de la variable "result"
		 * 2 Se realiza la resta con el numero 1
		 * 3 Se guarda el resultado en la misma variable "result"
		 * 
		 * El orden de la operacion es de deracha a la izquierda 
		 */
		
		result = result - 1;	
		System.out.println("el ressultado menos uno es " + result);
		//otra manela de restar el result 
		result -= 1;
		System.out.println("el resultado menos uno es " + result);
		
	
		//lo mismo que antes pero solo multiplicando 
		result = result * 2;
		System.out.println("el resultado multiplicado por 2 es: " + result);
		result *= 2;
		System.out.println("el resultado multiplicado por 2 es: " + result);
		
		
		//lo mismo pero con la division
		result = result / 2;
		System.out.println("el resultado dividido por 2 es: " + result);
		result /= 2;
		System.out.println("el resultado dividido por 2 es: " + result);	
	}
}
