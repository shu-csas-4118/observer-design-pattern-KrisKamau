package ObserverPatternDemo;

public class ObserverPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student("Garett", "Chang", 123456, "changgar@shu.edu");
		Professor ManfredMinimair = new Professor("Manfred", "Minimair", "minimman@shu.edu", "9737611234");
		Professor MarcoMorazan = new Professor("Marco", "Morazan", "morazmar@shu.edu", "9737613728");
		Course dataMining = new Course("Data Mining", 1121, 3, ManfredMinimair);
		Course programmingLanguages = new Course("Programming Languages", 2343, 3, MarcoMorazan);
		Course linearAlgebra = new Course("Linear Algebra", 9958, 3, ManfredMinimair);
		Course objectOriented = new Course("Object Oriented Programming", 4495, 3, MarcoMorazan);
		
		IdNumberObserver idObserver =  new IdNumberObserver();
		FirstNameObserver firstNameObserver = new FirstNameObserver();
		EmailObserver emailObserver = new EmailObserver();
		CourseObserver courseObserver = new CourseObserver();
		
		student.attachObserver("idNumberObserver", idObserver);
		student.attachObserver("firstNameObserver", firstNameObserver);
		student.attachObserver("emailObserver", emailObserver);
		student.attachObserver("courseObserver", courseObserver);
		
		student.setFirstName("Garrett");
		student.setIdNumber(54321);
		student.setEmail("changgarr@shu.edu");
		student.addCourse(dataMining);
		student.addCourse(linearAlgebra);
		student.addCourse(objectOriented);
		student.addCourse(programmingLanguages);
		student.removeCourse("Linear Algebra");
	}

}
