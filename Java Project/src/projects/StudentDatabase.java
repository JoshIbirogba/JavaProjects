package projects;

public class StudentDatabase {

	public static void main(String[] args) {
		Student student1 = new Student ("JoshIbirogba", "567509185");
		Student student2 = new Student ("Vokon", "245132267");
		Student student3 = new Student ("JohnIni", "569743368");
		
		
		student1.enroll("EN1010");
		student1.enroll("CS2010");
		student1.enroll("CS2910");
		
		//student1.showCourses();
		//student1.checkbalance();
		student1.payTuition(3000);
		//student1.checkbalance();
		System.out.println(student1.toString());
	}
}
	
	class Student {
		
		// properties of a student
	private static int iD = 5000;
	private String userID;
	private	String name;
	private String ssn;
	private String email;
	private String courses;
	private static final int courseCost = 1500;
	private int balance = 0;
	private String city;
	private String state;
	private String phone;
	
	public Student (String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
		setEmail();
		setUserID();
	}
	
	//setter method for email
	private void setEmail() {
		iD++;
		email = name.toLowerCase() + "." + iD + "@nwp.ca";
		System.out.println("Your email: " + email);
	}
	
	///getter method for email
	public String getEmail() {
		return email;
	}
	
	//setter method for userID
	private void setUserID () {
		int min = 1000;
		int max = 9000;
		int randNum = (int) (Math.random() * (max - min));
		randNum += min;
		userID = iD + "" + randNum + ssn.substring(6);
		System.out.println("Your User ID is : " + userID);
		System.out.println();
	}
	
	//setter method for city
	private void setCity() {
		this.city = city;
	}
	
	//getter method for city 
	public String getCity() {
		return city;
	}
	
	//setter method for state 
	private void setState() {
		this.state = state;
	}
	
	//getter method for state 
	public String getState() {
		return state;
	}
	
	//setter method for phone
	public void setPhone() {
		this.phone = phone;
	}
	
	//getter method for phone 
	public String getPhone() {
		return phone;
	}
	
	//methods for student properties
	public void enroll (String course) {
		this.courses +="\n" + course;
		balance += courseCost;
	}
	
	public void payTuition(int amount) {
		System.out.println("Payment of $" + amount + " is confirmed.");
		balance -= amount;
		
	}
	
	public void checkbalance() {
		System.out.println("Balance: $" + balance);
		
	}
	
	public void showCourses () {
		System.out.println(courses);
	}
	

	public String toString() {	
		return "[NAME: " + name + " ]\n[COURSES: " + courses + " ]\n[Balance: $" + balance + "]";
	}
}
