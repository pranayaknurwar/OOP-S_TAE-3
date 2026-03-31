package unit_2_oop_concept;

class Staff {
    void work() { System.out.println("Staff"); }
}

class Doctor extends Staff {
    void work() { System.out.println("Doctor"); }
}

class Nurse extends Staff {
    void work() { System.out.println("Nurse"); }
}

class Receptionist extends Staff {
    void work() { System.out.println("Receptionist"); }
}

public class HospitalStaff {
    public static void main(String[] args) {
        Staff s;

        s = new Doctor(); s.work();
        s = new Nurse(); s.work();
        s = new Receptionist(); s.work();
    }
}
