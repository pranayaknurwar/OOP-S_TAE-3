package unit_2_oop_concept;

abstract class Employee {
    abstract double calculateBonus();
}

class Manager extends Employee {
    double calculateBonus() {
        return 0.2 * 50000;
    }
}

class Developer extends Employee {
    double calculateBonus() {
        return 0.1 * 40000 + 5000;
    }
}

public class EmployeeBonus {
    public static void main(String[] args) {
        Employee e;

        e = new Manager();
        System.out.println(e.calculateBonus());

        e = new Developer();
        System.out.println(e.calculateBonus());
    }
}