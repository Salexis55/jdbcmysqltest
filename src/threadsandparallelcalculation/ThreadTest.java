package threadsandparallelcalculation;

public class ThreadTest {

public static void main(String[] args) {
		
		Airport airport = new Airport();
		airport.setCounter(1);
		
		Thread machine1 = new Thread(new EntranceRegistrationTask(airport));
		
		machine1.start();
		
		Thread machine2 = new Thread(new EntranceRegistrationTask(airport)); 
	
		machine2.start();
	
		System.out.println("the people left in the airport ar");
		System.out.println(Runtime.getRuntime().availableProcessors());
	}
}
