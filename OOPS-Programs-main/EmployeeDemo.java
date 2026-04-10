class Employee {

    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class EmployeeDemo {

    public static void main(String[] args) {

        Employee e1 = new Employee("Rahul", 30000);
        Employee e2 = new Employee("Anita", 35000);

        e1.display();
        e2.display();
    }
}