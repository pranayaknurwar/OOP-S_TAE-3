package unit_4_exception_handling;

public class BankingSystem {

    private int balance = 1000;

    public void withdraw(int amount) {
        synchronized (this) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Balance deducted: " + amount);
            } else {
                System.out.println("Insufficient balance");
            }
        }
    }

    public static void main(String[] args) {

        BankingSystem bank = new BankingSystem();

        Thread t1 = new Thread(() -> bank.withdraw(700));
        Thread t2 = new Thread(() -> bank.withdraw(500));

        t1.start();
        t2.start();
    }
}
