package unit_2_oop_concept;

class Shape {
    void display() {
        System.out.println("Shape");
    }
}

class Circle extends Shape {
    void area() {
        System.out.println("Circle Area: " + (3.14 * 5 * 5));
    }
}

class Rectangle extends Shape {
    void area() {
        System.out.println("Rectangle Area: " + (4 * 5));
    }
}

public class ShapeInheritance {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.display();
        c.area();

        r.display();
        r.area();
    }
}
