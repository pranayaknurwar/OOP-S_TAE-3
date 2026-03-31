package unit_1_classes_objects;

import java.util.Scanner;

class Resort {
    int RNo;
    String Name;
    double Charges;
    int Days;

    void Getinfo() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Room Number: ");
        RNo = sc.nextInt();
        sc.nextLine(); // fix for nextLine issue

        System.out.print("Enter Customer Name: ");
        Name = sc.nextLine();

        System.out.print("Enter Charges per Day: ");
        Charges = sc.nextDouble();

        System.out.print("Enter Number of Days: ");
        Days = sc.nextInt();
    }

    
    double Compute() {
        double amount = Days * Charges;

        if (amount > 11000) {
            amount = 1.02 * amount; // 2% extra
        }

        return amount;
    }

    void DispInfo() {
        double amount = Compute();

        System.out.println("\n--- Resort Details ---");
        System.out.println("Room Number: " + RNo);
        System.out.println("Customer Name: " + Name);
        System.out.println("Charges per Day: " + Charges);
        System.out.println("Days Stayed: " + Days);
        System.out.println("Total Amount: " + amount);
    }
}

public class Resort_System {
    public static void main(String[] args) {

        Resort r = new Resort();

        r.Getinfo();   
        r.DispInfo();  
    }
}
