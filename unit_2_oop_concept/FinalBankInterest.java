package unit_2_oop_concept;

class Bank {
    final double rate = 7.5;

    double calc(double amt) {
        return (amt * rate) / 100;
    }
}

public class FinalBankInterest {
    public static void main(String[] args) {
        Bank b = new Bank();

        System.out.println(b.calc(10000));
        System.out.println(b.calc(20000));
    }
}
