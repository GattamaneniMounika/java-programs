class EmployeeInfo{
	int id;
	String name;

void display() {
	System.out.println(id+" "+name);
	}
}

public class constructorDemo {

public static void main(String[] args) {

	EmployeeInfo emp1=new EmployeeInfo();
	EmployeeInfo emp2=new EmployeeInfo();

	emp1.display();
	emp2.display();
	}
}

//parameterized constructor
class Student{
	int id;
	String name;

	Student(int i,String n)
	{
	id=i;
	name=n;
	}

	void display() {
	System.out.println(id+" "+name);
	}
}

