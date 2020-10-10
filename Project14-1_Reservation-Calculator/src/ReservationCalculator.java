import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ReservationCalculator {
    public static void main(String[] args) {
        System.out.println("Reservation Calculator\n");
        Scanner input = new Scanner(System.in);
        char choice;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        do {

            Reservation reservation = new Reservation();
            System.out.print("Enter arrival date in format (MM/DD/YYYY): ");
            String arrivalDate = input.next();
            System.out.print("Enter departure date in format (MM/DD/YYYY): ");
            String departureDate = input.next();
            reservation.setArrivalDate(LocalDate.parse(arrivalDate,formatter));
            reservation.setDepartureDate(LocalDate.parse(departureDate,formatter));
           
            System.out.println("Arrival Date: " + reservation.getArrivalDateFormatted());
            System.out.println("Departure Date: " + reservation.getDepartureDateFormatted());
            System.out.println("Price: " + reservation.getPricePerNightFormatted() + " per night");
            System.out.println("Total price: " + reservation.getTotalPriceFormatted() + " for " + reservation.getNumberOfNights() + " nights");

            System.out.print("Continue? (y/n): ");
            choice = input.next().toLowerCase().charAt(0);
        }while (choice=='y');
        System.out.println("Bye!");
    }
}

