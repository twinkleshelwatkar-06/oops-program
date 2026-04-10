abstract class Employee {
    String name;
    int id;

    abstract void calculateBonus(double salary);
}

class Manager extends Employee {

    void calculateBonus(double salary) {
        double bonus = salary * 0.20;
        System.out.println("Manager Bonus = " + bonus);
    }
}

class Developer extends Employee {

    void calculateBonus(double salary) {
        double bonus = salary * 0.10 + 5000;
        System.out.println("Developer Bonus = " + bonus);
    }
}

public class Main6 {
    public static void main(String[] args) {

        Employee e1 = new Manager();
        Employee e2 = new Developer();

        e1.calculateBonus(50000);
        e2.calculateBonus(50000);
    }
}