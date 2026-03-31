package unit_1_classes_objects;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println();
    }
}

public class Person_Class {
    public static void main(String[] args) {

        Person p1 = new Person("Pranay", 20);
        Person p2 = new Person("Rahul", 22);

        p1.display();
        p2.display();
    }
}
