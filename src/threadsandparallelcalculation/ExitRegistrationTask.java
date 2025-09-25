package threadsandparallelcalculation;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;


public class ExitRegistrationTask implements Runnable {

	private Airport airport;

	public ExitRegistrationTask(Airport airport) {
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

			System.out.println("The thread " + Thread.currentThread().getName() + " has entered the sleep mode");

			Thread.sleep(2000);

			for (int i = 0; i < 1000; i++) {
				airport.decrease();
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("The task is finished");
	}
}
