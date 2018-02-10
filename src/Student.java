package ObserverPatternDemo;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
	private String firstName;
	private String lastName;
	private String email;
	private int idNumber;
	private HashMap<String, IObserver> observers;
	private ArrayList<Course> courses;
	
	public Student(String firstName, String lastName, int idNumber, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = idNumber;
		this.email = email;
		this.observers = new HashMap<String, IObserver>();
		this.courses = new ArrayList<Course>();
	}
	
	public Student() {
		this.observers = new HashMap<String, IObserver>();
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
		notifyObserver("firstNameObserver");
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getIdNumber() {
		return this.idNumber;
	}
	
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
		notifyObserver("idNumberObserver");
	}	
	
	public void setEmail(String email) {
		this.email = email;
		notifyObserver("emailObserver");
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public ArrayList<Course> getCourses() {
		return this.courses;
	}
	
	public void addCourse(Course course) {
		this.courses.add(course);
		notifyObserver("courseObserver");
	}
	
	public void removeCourse(String course) {
		for(int i = 0; i < this.courses.size(); i++) {
			if(this.courses.get(i).getCourseName() == course) {
				this.courses.remove(i);
				break;
			}
		}
		notifyObserver("courseObserver");
	}
	
	public void attachObserver(String observerType, IObserver observer) {
		this.observers.put(observerType, observer);
	}
	
	public void notifyObserver(String observerType) {
		IObserver observer = this.observers.get(observerType);
		if(observer != null) {
			observer.update(this);
		}
	}
	
	
}
