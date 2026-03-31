package unit_4_exception_handling;

public class OnlineShoppingSystem {

    public void processOrder() {
        Thread payment = new Thread(() -> System.out.println("Processing payment..."));
        Thread order = new Thread(() -> System.out.println("Order confirmed..."));

        payment.start();
        order.start();
    }

    public static void main(String[] args) {
        OnlineShoppingSystem app = new OnlineShoppingSystem();
        app.processOrder();
    }
}
