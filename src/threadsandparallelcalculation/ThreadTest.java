package threadsandparallelcalculation;

public class ThreadTest {

	public static void main(String[] args) {
		
		Airport airport = new Airport();
	
		Thread thread1 = new Thread(new EntranceRegistrationTask(airport));
		thread1.start();
		
		Thread thread2 = new Thread(new EntranceRegistrationTask(airport));
		thread2.start();
		
		try {
			
			
		}
		
	}
}
