import java.util.*;

class Student1{
	String name, usn, type;
	Student1(String name,String usn,String type){
		this.name = name;
		this.usn = usn;
		this.type = type;
	}
	
	void display(){
		System.out.println("Name : " + name);
		System.out.println("USN : " + usn);
		System.out.println("Type : " + type);
	}
}

class ug extends Student1{
	int credits, semester;
	ug(String name, String usn, String type, int credits, int semester){
		super(name, usn, type);
		this.credits = credits;
		this.semester = semester;
	}
	void display(){
		super.display();
		try{
			if (type.equals("regular") || type.equals("cob")){
				if(credits<200){
					throw new creditException(credits, type);
				}
			}
			if (type.equals("diploma")){
				if(credits<175){
					throw new creditException(credits, type);
				}
			}
		}
		catch(creditException e){
			System.out.println(e);
		}
		System.out.println("Credits : " + credits);
		System.out.println("Semester : " + semester);
	}
}

class pg extends Student1{
	int credits, semester;
	pg(String name, String usn, String type, int credits, int semester){
		super(name, usn, type);
		this.credits = credits;
		this.semester = semester;
	}
	void display(){
		super.display();
		try{
			if (type.equals("regular") || type.equals("cob")){
				if(credits<200){
					throw new creditException(credits, type);
				}
			}
			if (type.equals("diploma")){
				if(credits<175){
					throw new creditException(credits, type);
				}
			}
		}
		catch(creditException e){
			System.out.println(e);
		}
		System.out.println("Credits : " + credits);
		System.out.println("Semester : " + semester);
	}
}

class creditException extends Exception{
	String val;
	creditException(int credits, String type){
		val = credits + " " + type; 
	}
	public String toString(){
		return "Exception : "+val;
	}
}

public class Student {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name, usn, type;
		int credits, semester;
		System.out.println("Enter name of the student, USN, type, credit, semesters of UG Student");
		name = sc.next();
		usn = sc.next();
		type = sc.next();
		credits = sc.nextInt();
		semester = sc.nextInt();
		ug u = new ug(name, usn, type, credits, semester);
		u.display();
		
		System.out.println("Enter name of the student, USN, type, credit, semesters of PG Student");
		name = sc.next();
		usn = sc.next();
		type = sc.next();
		credits = sc.nextInt();
		semester = sc.nextInt();
		pg p = new pg(name, usn, type, credits, semester);
		p.display();
		sc.close();
	}

}
