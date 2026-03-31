package unit_4_exception_handling;

import java.util.InputMismatchException;

public class StudentInputSystem {

    public String validateAge(int age) {
        try {
            if (age <= 0) throw new ArithmeticException();
            return "Student age is: " + age;
        } catch (ArithmeticException | InputMismatchException e) {
            return "Invalid input";
        }
    }

    public static void main(String[] args) {
        StudentInputSystem app = new StudentInputSystem();
        System.out.println(app.validateAge(-5));
    }
}
