import java.util.ArrayList;
import java.util.Scanner;

public class Reservation {
    public static void main(String[] args) {
        // Train train1 = new Train(1, true, 45);
        // Train train2 = new Train(2, false, 50);

        ArrayList<Train> trains = new ArrayList<>();
        ArrayList<Booking> bookings = new ArrayList<>();
        trains.add(new Train(1, true, 2));
        trains.add(new Train(2, true, 4));
        trains.add(new Train(3, true, 3));
        trains.add(new Train(4, false, 3));

        int userInput = 1;
        Scanner s = new Scanner(System.in);
        // display train details
        for (Train i : trains) {
            i.displyTrainInfo();
        }
        while (userInput == 1) {
            System.out.println("Enter 1 to book or 2 to exit: ");
            userInput = s.nextInt();
            if (userInput == 1) {
                Booking booking = new Booking();
                if (booking.isAvailable(trains, bookings)) {
                    bookings.add(booking);
                    System.out.println("Your booking is confirmed.");
                } else {
                    System.out.println("Sorry.Bus is full.Try another bus or for different date.");
                }
            }
        }
    }
}
