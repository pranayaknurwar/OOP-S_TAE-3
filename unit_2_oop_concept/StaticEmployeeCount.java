package unit_2_oop_concept;

class Employee {
    static int count = 0;

    Employee() { count++; }

    static void show() {
        System.out.println(count);
    }
}

public class StaticEmployeeCount {
    public static void main(String[] args) {
        new Employee();
        new Employee();
        new Employee();

        Employee.show();
    }
}
