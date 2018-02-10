package ObserverPatternDemo;

public class CourseObserver implements IObserver{
	
	public CourseObserver() {
		
	}
	
	public void update(Student student) {
		System.out.println("Student's courses are:");
		for(Course course: student.getCourses()) {
			course.printCourseInfo();			
		}
	}

}
