package unit_4_exception_handling;

public class ATMWithdrawal {

    public int withdraw(int balance, int amount) throws Exception {
        if (amount > balance) {
            throw new Exception("Insufficient Balance");
        }
        return balance - amount;
    }

    public static void main(String[] args) {
        ATMWithdrawal app = new ATMWithdrawal();
        try {
            int result = app.withdraw(1000, 1200);
            System.out.println("Remaining balance: " + result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
