package unit_2_oop_concept;

abstract class Shape {
    abstract void calculate_area();

    void display_info() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    double radius = 5;

    void calculate_area() {
        System.out.println("Circle Area: " + (3.14 * radius * radius));
    }
}

class Rectangle extends Shape {
    int l = 4, b = 5;

    void calculate_area() {
        System.out.println("Rectangle Area: " + (l * b));
    }
}

public class Shape_Abstraction{
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        s1.display_info();
        s1.calculate_area();

        s2.display_info();
        s2.calculate_area();

        // Shape s = new Shape(); ❌ ERROR (cannot instantiate abstract class)
    }
}
