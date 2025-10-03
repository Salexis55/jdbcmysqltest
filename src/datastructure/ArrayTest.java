package datastructure;
import java.util.Arrays;


public class ArrayTest {

	public static void main(String[] args) {
		// == operador de igualdad
		// = operador de establecer un valor a una variable
		System.out.println(1 == 1);

		// create an array
		int[] scores = { 12, 123, 435 };
		// int[] nums = { 12, 123123, 435, 34 };

		reverse(scores);

		sumup(scores);
		findMaxMin(scores);
		switchValues(scores, 1, 4);

	}

	private static void reverse(int[] scores) {
		

	}
	
	
	
	private static void createObjeects() {
		// Un array
		User[] clients = new User[2];
		// Store a user object at the first position of the array
		clients[0] = new User(0, "amno", "pas", false, 0);
		// Store a user object at the second position of the array
		clients[1] = new User(1, "amno", "pas", false, 0);
		// Imprimir la longitud del array
		System.out.println(scores.length);
		System.out.println("the length of the array clients " + clients.length);

		for (int i = 0; i < clients.length; i++) {
			clients[i] = new User(i, "amno" + i, "pas" + i, false, 0);
		}

		for (int i = 0; i < clients.length; i++) {
			System.out.println(clients[i].getUsername());
		}

		// Exception in thread "main" java.lang.NullPointerException: Cannot read the
		// array length because "booleans" is null
		boolean[] booleans = null;
		System.out.println(booleans.length);
		// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 2
		// out of bounds for length 2
		User[] users = { new User(), new User(0, "amno", "pas", false, 0) };
		System.out.println(users.length);
		System.out.println(users[2]);
	}


	private static void switchValues(int[] arr, int i, int j) {

		int num = arr[i];
		arr[i] = arr[j];
		arr[j] = num;
		System.out.println(Arrays.toString(arr));

	}

	private static void findMaxMin(int[] scores) {
		// TODO Auto-generated method stub

	}

	private static void sumup(int[] scores) {
		int sum = scores[0] + scores[1] + scores[2];
		System.out.println("the total score is " + sum);
		int totalscore = 0;
		for (int i = 0; i < scores.length; i++) {
			totalscore = scores[i] + totalscore;
		}
		System.out.println("the total score is " + totalscore);
	}
}
