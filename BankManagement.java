import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Employee {
	int id;
	String name;
	String postName;
	int age;
	static int idCounter = 1;

	// ArrayList Emp_data;

	Employee(String name, String postName, int age) {
		this.name = name;
		this.postName = postName;
		this.age = age;
		this.id = idCounter++;

	}

	// void display(){
	// System.out.println(name);
	// System.out.println(postName);
	// System.out.println(age);
	// }

}

class BankManagement {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Employee obj;
		System.out.println("============>>>>>>|| Welcome to our Bank ||<<<<<<===============");
		int press;
		List<Employee> arr = new ArrayList<>();

		while (true) {

			System.out.println("1 -> Add Employee");
			System.out.println("2 -> See All Employee Data");
			System.out.println("3 -> See Employee Data using ID ");
			System.out.println("0 -> Exit");
			press = sc.nextInt();
			switch (press) {
				case 1:
					System.out.println("How many Employee you want to add ");
					int empCount = sc.nextInt();
					for (int i = 0; i < empCount; i++) {
						System.out.println("Enter User " + (i + 1) + " Name :-");
						String name = sc.next();
						System.out.println("Enter User " + (i + 1) + " Post :-");
						String post = sc.next();
						System.out.println("Enter User " + (i + 1) + " Age :-");
						int age = sc.nextInt();
						obj = new Employee(name, post, age);
						arr.add(obj);

					}
					break;
				case 2:
					for (Employee employee : arr) {
						System.out.println("======================= ||  Name: " + employee.name + ", Post: "
								+ employee.postName + ", Age: "
								+ employee.age + ", ID: " + employee.id + " || ====================");

					}
					break;

				case 3:
					System.out.println("enter your id ");
					int idd = sc.nextInt();
					for (Employee employee : arr) {
						if (employee.id == idd) {
							System.out.println("======================= ||  Name: " + employee.name + ", Post: "
									+ employee.postName + ", Age: "
									+ employee.age + ", ID: " + employee.id + " || ====================");
						}

					}
					System.out.println("You Enter Wrong Id !");

				case 0:
					break;

				default:
					System.out.println("Choose Wrong number !!");
			}

			if (press == 0) {
				break;
			}
		}
		sc.close();

	}
}

/*
 * welcome to bank management app
 * 1. employee
 * see employee
 * -total employee
 * -post
 * -name
 * -add employee
 * -name
 * -age
 * -post
 * // 2. user detail by account number
 */