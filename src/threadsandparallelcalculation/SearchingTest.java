package threadsandparallelcalculation;

import datastructure.User;

public class SearchingTest {
	public static void main(String[] args) {

		// El nombre que queremos examinar si existe en el array de usuarios
		String targetName = "Alejandro55";
		System.out.println("Alejandro55" == targetName);

		User[] clients = new User[20000];
		for (int i = 0; i < clients.length; i++) {
			clients[i] = new User(i, "Alejandro" + i, "pass" + i, false, 0);
		}

		searchWithOneThread(targetName, clients);

		searchingWitchMultipleThreads(targetName, clients);

		for (int i = 0; i < clients.length; i++) {
			if (clients[i].getUsername() == targetName) {
				System.out.println("id of the user is " + clients[i]);
			}
		}

	}
	//crear los hilos pasando a cada hilo una tarea 
	private static void searchingWitchMultipleThreads(String target, User[] clients) {
		
		int index = clients.length / 4;
		
		Thread thread1 =
			new Thread(new UserSearchingTask(target, clients, 0, index));
		Thread thread2 =
			new Thread(new UserSearchingTask(target, clients, index, 2 * index));
		Thread thread3 =
			new Thread(new UserSearchingTask(target, clients, 2 * index, 3 * index));
		Thread thread4 =
			new Thread(new UserSearchingTask(target, clients, 3 * index, 4 * index));
		
		//lanzar las tareas de los hilos
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		int numOfThreads = Runtime.getRuntime().availableProcessors();
				for (int i = 0; i < numOfThreads; i++) {
		
		Thread thread5 =
			new Thread(new UserSearchingTask(target, clients, i * index, i * index + index));
		
		thread5.start();
				}
		
	}

	private static void searchWithOneThread(String targetName, User[] clients) {

		for (int i = 0; i < clients.length; i++) {
			if (clients[i].getUsername() == targetName) {
				System.out.println("id of the user is " + clients[i]);
			}

		}
	}
}