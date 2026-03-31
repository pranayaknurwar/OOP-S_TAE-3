package unit_2_oop_concept;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void show() {
        System.out.println(name + " " + salary);
    }
}

public class ConstructorThis {
    public static void main(String[] args) {
        Employee e = new Employee("Pranay", 50000);
        e.show();
    }
}
