package threadsandparallelcalculation;

import datastructure.User;

public class SearchingTest {
	public static void main(String[] args) {
		
		
		//El nombre que queremos examinar si existe en el array de usuarios
		String targetName = "Alejandro55";
		System.out.println("Alejandro55" == targetName);
		
		
		User[] clients = new User[20000];
		for (int i = 0; i < clients.length; i++) {
			clients[i] = new User(i, "Alejandro" + i, "pass" + i, false, 0);
		}
		
	}

}
