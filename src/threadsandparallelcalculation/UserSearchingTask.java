package threadsandparallelcalculation;

import datastructure.User;

public class UserSearchingTask implements Runnable {

	private String target = null;

	private User[] clients = null;

	private int beginning = -1, end = -1;
	
	
	public UserSearchingTask(String target, User[] clients, int beginning2, int end1) {
		this.target = target;
		this.clients = clients;
		this.beginning = beginning2;
		this.end = end1;
	}
	
	
	

	public void run() {
		/**
		 * La tarea consiste en buscar determinado usuario en un rango especifico del
		 * array
		 */
		for (int i = beginning; i < end; i++) {
			if (clients[i].getUsername() == target) {
				System.out.println("id of the user is " + clients[i].getId()); 

			}

		}
	}
}