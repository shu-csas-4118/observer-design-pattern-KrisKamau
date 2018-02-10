package ObserverPatternDemo;

public class EmailObserver implements IObserver {

	public EmailObserver() {
		
	}
	
	public void update(Student student) {
		System.out.println("Student's email address is " + student.getEmail());
	}

}
