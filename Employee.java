package OOPSjava;

public class Employee {
	
	    String name;
	    int id;
	    double salary;

	    Employee() {
	        this("Unknown", 0, 0.0);
	    }

	    Employee(String name) {
	        this(name, 0, 0.0);
	    }

	    Employee(String name, int id, double salary) {
	        this.name = name;
	        this.id = id;
	        this.salary = salary;
	    }

	    void display() {
	        System.out.println("Name: " + name);
	        System.out.println("ID: " + id);
	        System.out.println("Salary: " + salary);
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        Employee e1 = new Employee();
	        Employee e2 = new Employee("Angel");
	        Employee e3 = new Employee("John", 101, 25000);

	        e1.display();
	        e2.display();
	        e3.display();
	    }
	}
