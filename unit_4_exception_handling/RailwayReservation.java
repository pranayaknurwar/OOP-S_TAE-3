package unit_4_exception_handling;

public class RailwayReservation {

    private int seats = 1;

    public synchronized void bookTicket() {
        if (seats > 0) {
            seats--;
            System.out.println("Ticket booked successfully");
        } else {
            System.out.println("No tickets available");
        }
    }

    public static void main(String[] args) {
        RailwayReservation rr = new RailwayReservation();

        Thread t1 = new Thread(rr::bookTicket);
        Thread t2 = new Thread(rr::bookTicket);

        t1.start();
        t2.start();
    }
}
