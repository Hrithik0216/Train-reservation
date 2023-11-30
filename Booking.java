import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Booking {
    String passengerName;
    Date date; // Date object. Not string
    int trainNo;

    Booking() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the passenger's name: ");
        passengerName = s.next();
        System.out.println("Enter the train no:  ");
        trainNo = s.nextInt();
        System.out.println("Enter the date dd-mm-yyyy");
        String dateInput = s.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        // To convert string to date object
        try {
            date = dateFormat.parse(dateInput);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public boolean isAvailable(ArrayList<Train> trains, ArrayList<Booking> bookings) {
        int capacity = 0;
        for (Train i : trains) {
            if (i.getTrainNo() == trainNo) {
                capacity = i.getCapacity();
            }
        }
        int booked = 0;
        for (Booking j : bookings) {
            if (j.trainNo == trainNo && j.date.equals(date)) {
                booked++;
            }
        }
        return booked < capacity ? true : false;
    }

}
