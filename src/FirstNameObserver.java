package ObserverPatternDemo;

public class FirstNameObserver implements IObserver {
	//private Student student;
	
	public FirstNameObserver() {
		
	}
	
	public void update(Student student) {		
		System.out.println("Student's first name is " + student.getFirstName());
	}
}
