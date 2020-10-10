import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class Reservation {
    private final double nightlyRate = 145.00;
    private LocalDate arrivalDate;
    private LocalDate departureDate;
    
    public Reservation() {
		super();
	}
    
	public Reservation(LocalDate arrivalDate, LocalDate departureDate) {
		super();
		this.arrivalDate = arrivalDate;
		this.departureDate = departureDate;
	}

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }
    
    public String getArrivalDateFormatted()
    {
        return arrivalDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
    }
    
    public  void setArrivalDate(LocalDate arrivalDate) {
        this.arrivalDate = arrivalDate;
    }
    
    public String getDepartureDateFormatted()
    {
        return departureDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
    }
    
    public int getNumberOfNights()
    {
        return (int) ChronoUnit.DAYS.between(arrivalDate,departureDate);
    }
    
    public String getPricePerNightFormatted()
    {
        return NumberFormat.getCurrencyInstance().format(nightlyRate);
    }
    
    public double getTotalPrice()
    {
       return nightlyRate * getNumberOfNights();

    }
    
    public String getTotalPriceFormatted()
    {
        return NumberFormat.getCurrencyInstance().format(getTotalPrice());
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }
}
	