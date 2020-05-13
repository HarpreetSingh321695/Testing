package CustomAnnotations;

@Course(cid = "C-222")
public class Student 
{
	int sid;
	String name;
	
	public Student(int sid, String name) {
		super();
		this.sid = sid;
		this.name = name;
	}
	
	public void getStudentDetails()
	{
		System.out.println("Student ID: " + this.sid);
		System.out.println("Student Name: " + this.name);
		System.out.println("-------------------------------");
	}
}
