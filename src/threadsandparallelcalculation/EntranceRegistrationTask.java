package threadsandparallelcalculation;

public class EntranceRegistrationTask implements Runnable {
	
	private Airport airport;
	

	public EntranceRegistrationTask(Airport airport) {
		this.airport = airport;
		// TODO Auto-generated constructor stub
	}

	/**
	 * el metodo "run" es donde se define la tarea para un hilo
	 * 
	 */
	
	@Override
	public void run() {
		// Thread.sleep(2000)
		System.out.println("Start the task");
		try {
			System.out.println("The thread name is" + Thread.currentThread().getName());
			Thread.sleep(2000);
			System.out.println("The thread");
			
			for (int i = 0; i < 1000; i++) {
				airport.increment();
			}
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("The task is finished");
	}
}