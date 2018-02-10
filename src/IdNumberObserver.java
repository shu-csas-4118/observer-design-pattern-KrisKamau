package ObserverPatternDemo;

public class IdNumberObserver implements IObserver {
	
	public IdNumberObserver() {
		
	}
	
	public void update(Student student) {
		System.out.println("Student's id number is " + student.getIdNumber());
	}

}
