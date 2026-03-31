package unit_4_exception_handling;

public class Restaurant {

    private boolean foodReady = false;

    public synchronized void prepareFood() throws InterruptedException {
        while (foodReady) wait();
        System.out.println("Chef prepared food");
        foodReady = true;
        notify();
    }

    public synchronized void serveFood() throws InterruptedException {
        while (!foodReady) wait();
        System.out.println("Waiter served food");
        foodReady = false;
        notify();
    }

    public static void main(String[] args) {

        Restaurant r = new Restaurant();

        Thread chef = new Thread(() -> {
            try {
                r.prepareFood();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread waiter = new Thread(() -> {
            try {
                r.serveFood();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        chef.start();
        waiter.start();
    }
}
