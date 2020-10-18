import java.time.LocalDate;

public class Request {
	private int ID;
	private String Description;
	private String Justification;
	private LocalDate DateNeeded;
	private String DeliveryMode;
	private String Status;
	private Double Total;
	private String SubmittedDate;
	private String ReasonForRejection;
	
	public Request() {
		super();
	}

	public Request(int iD, String description, String justification, LocalDate dateNeeded, String deliveryMode,
			String status, Double total, String submittedDate, String reasonForRejection) {
		super();
		this.ID = iD;
		this.Description = description;
		this.Justification = justification;
		this.DateNeeded = dateNeeded;
		this.DeliveryMode = deliveryMode;
		this.Status = status;
		this.Total = total;
		this.SubmittedDate = submittedDate;
		this.ReasonForRejection = reasonForRejection;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		this.ID = iD;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		this.Description = description;
	}

	public String getJustification() {
		return Justification;
	}

	public void setJustification(String justification) {
		this.Justification = justification;
	}

	public LocalDate getDateNeeded() {
		return DateNeeded;
	}

	public void setDateNeeded(LocalDate dateNeeded) {
		this.DateNeeded = dateNeeded;
	}

	public String getDeliveryMode() {
		return DeliveryMode;
	}

	public void setDeliveryMode(String deliveryMode) {
		this.DeliveryMode = deliveryMode;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		this.Status = status;
	}

	public Double getTotal() {
		return Total;
	}

	public void setTotal(Double total) {
		this.Total = total;
	}

	public String getSubmittedDate() {
		return SubmittedDate;
	}

	public void setSubmittedDate(String submittedDate) {
		this.SubmittedDate = submittedDate;
	}

	public String getReasonForRejection() {
		return ReasonForRejection;
	}

	public void setReasonForRejection(String reasonForRejection) {
		this.ReasonForRejection = reasonForRejection;
	}

	@Override
	public String toString() {
		return "Request [ID=" + ID + ", Description=" + Description + ", Justification=" + Justification
				+ ", DateNeeded=" + DateNeeded + ", DeliveryMode=" + DeliveryMode + ", Status=" + Status + ", Total="
				+ Total + ", SubmittedDate=" + SubmittedDate + ", ReasonForRejection=" + ReasonForRejection
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}
