package unit_1_classes_objects;

import java.util.Scanner;

class CARRENTAL {
    int CarId;
    String CarType;
    float Rent;

    void GetCar() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Car ID: ");
        CarId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Car Type (Small/Van/SUV): ");
        CarType = sc.nextLine();
    }

    float GetRent() {
        if (CarType.equalsIgnoreCase("Small")) {
            Rent = 1000;
        } else if (CarType.equalsIgnoreCase("Van")) {
            Rent = 800;
        } else if (CarType.equalsIgnoreCase("SUV")) {
            Rent = 2500;
        } else {
            Rent = 0;
            System.out.println("Invalid Car Type!");
        }
        return Rent;
    }

    void ShowCar() {
        GetRent();

        System.out.println("\n--- Car Details ---");
        System.out.println("Car ID: " + CarId);
        System.out.println("Car Type: " + CarType);
        System.out.println("Rent: " + Rent);
    }
}

public class Car_Rental {
    public static void main(String[] args) {

        CARRENTAL car = new CARRENTAL();

        car.GetCar();
        car.ShowCar();
    }
}
