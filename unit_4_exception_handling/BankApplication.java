package unit_4_exception_handling;

public class BankApplication {

    public void processTransaction() throws Exception {
        throw new Exception("Transaction failed");
    }

    public static void main(String[] args) {
        BankApplication app = new BankApplication();
        try {
            app.processTransaction();
            System.out.println("Transaction processed");
        } catch (Exception e) {
            System.out.println("Exception handled in main");
        }
    }
}
