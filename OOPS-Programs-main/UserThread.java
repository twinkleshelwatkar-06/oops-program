class RailwayReservation {
    int seats = 1;

    synchronized void bookTicket(String name) {
        if (seats > 0) {
            System.out.println(name + ": Ticket booked successfully");
            seats--;
        } else {
            System.out.println(name + ": No tickets available");
        }
    }
}

class UserThread extends Thread {
    RailwayReservation rr;
    String name;

    UserThread(RailwayReservation rr, String name) {
        this.rr = rr;
        this.name = name;
    }

    public void run() {
        rr.bookTicket(name);
    }
}

public class Main {
    public static void main(String[] args) {
        RailwayReservation rr = new RailwayReservation();

        UserThread u1 = new UserThread(rr, "User1");
        UserThread u2 = new UserThread(rr, "User2");

        u1.start();
        u2.start();
    }
}