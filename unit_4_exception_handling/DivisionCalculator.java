package unit_4_exception_handling;

public class DivisionCalculator {

    public String divide(int a, int b) {
        try {
            return "Result: " + (a / b);
        } catch (ArithmeticException e) {
            return "Cannot divide by zero";
        }
    }

    public static void main(String[] args) {
        DivisionCalculator app = new DivisionCalculator();
        System.out.println(app.divide(10, 0));
    }
}
