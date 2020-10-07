package business;

public class Movie {
	//instance variables 
	private int movieID;
	private String Title;
	private String Year;
	private String Rating;
	private String Genre;
	
	//empty constructor 
	public Movie() {
		super();
	}

	//fully loaded constructor 
	public Movie(int movieID, String title, String year, String rating, String genre) {
		super();
		this.movieID = movieID;
		this.Title = title;
		this.Year = year;
		this.Rating = rating;
		this.Genre = genre;
	}

	//getter/setter
	public int getMovieID() {
		return movieID;
	}

	public void setMovieID(int movieID) {
		this.movieID = movieID;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		this.Title = title;
	}

	public String getYear() {
		return Year;
	}

	public void setYear(String year) {
		this.Year = year;
	}

	public String getRating() {
		return Rating;
	}

	public void setRating(String rating) {
		this.Rating = rating;
	}

	public String getGenre() {
		return Genre;
	}

	public void setGenre(String genre) {
		this.Genre = genre;
	}
	
	public String displayMovieSummary() {
		String str = "*****Movie Summary*****\n";
		str += "-----------------------\n";
		str += movieID + " " + Title + " " + Rating + " " + "was released in" + " " + Year+ "."+ " " + "Genre(s):" + " " + Genre;
				
		return str;
	}
}
