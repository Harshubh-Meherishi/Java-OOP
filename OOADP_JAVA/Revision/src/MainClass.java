import java.util.*;

class Student{
	String name,usn;
	int age;
	Student(String name,String usn,int age)
	{
		this.name = name;
		this.usn = usn;
		this.age = age;
		
	}
	public String toString()
	{
		return name + " " + usn + " " + age + " ";
	}
	
}
public class MainClass {

	public static void main(String args[])
	{
		ArrayList<Student> arrst = new ArrayList <Student>();
		arrst.add(new Student("ABC","1MS17",20));
		Student S1 = new Student("XYZ","1MS20",30);
		arrst.add(S1);
		for (Student S: arrst)
		{
			System.out.println(S);
			
		}
	}
}
