package CustomAnnotations;

import java.lang.annotation.Annotation;

public class Demo 
{
	public static void main(String[] args)
	{
		Student st = new Student(1, "Harpreet Singh");
		Student st1 = new Student(2, "Sagar");
		Student st2 = new Student(3, "Amenine");
		st.getStudentDetails();
		st1.getStudentDetails();
		st2.getStudentDetails();
		
		Class c = st.getClass();
		Annotation an = c.getAnnotation(Course.class);
		Course co = (Course) an;
		
		System.out.println("-------------------------------");
		System.out.println("Course Offered to every student..");
		System.out.println("Course ID: " + co.cid());
		System.out.println("Course Name: " + co.cname());
		System.out.println("Course Cost: " + co.ccost());

	}

}
