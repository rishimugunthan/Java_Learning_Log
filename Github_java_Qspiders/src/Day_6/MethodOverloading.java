package Day_6;

public class MethodOverloading {
	
	//Different Parameters
	static void add(int a, int b) {
		System.out.println("The Addition of two number is: " + (a+b));
	}
	static void add(int a, int b, int c) {
		System.out.println("The Addition of Three number is: " + (a + b + c));
	}
	
	//Different DataType of Parameter
	static void user(String name) {
		System.out.println("User Name is: " + name);
	}
	static void user(int age) {
		System.out.println("User Age is: " + age);
	}
	
	//Different Order of Parameter
	static void admin(String role, int rollno) {
		System.out.println("Admin role and rollNo: " + role + " " + rollno);
	}
	static void admin(int rollno, String role) {
		System.out.println("Admin rollno and roll: " + rollno + " " + role);
	}
	public static void main(String[] args) {
//		add(10,20);
//		user("Rishi");
//		user(21);
		admin("fullstack",34);
		admin(34,"FullStack");
	}
	
}
