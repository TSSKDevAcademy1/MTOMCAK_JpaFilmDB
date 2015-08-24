package MovieDatabase;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Inheritance;

@Entity
@Inheritance
public class Movie extends VideoArt {

	/** First day of release in cinema. */
	Date publicationDate;

	/** Length film in minutes. */
	int minutes;

	public Movie() {
	}

	/** Constructor with parameters. */
	public Movie(Date publicationDate, int minutes) {
		this.minutes = minutes;
		/** Catch date parse exception. */
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			Date releaseDate = dateFormat.parse(publicationDate.toString());

			this.publicationDate = releaseDate;

		} catch (ParseException e) {
			System.out.println(e);
		}
	}

	/**
	 * @return the publicationDate
	 */
	public Date getPublicationDate() {
		return publicationDate;
	}

	/**
	 * @param publicationDate the publicationDate to set
	 */
	public void setPublicationDate(Date publicationDate) {
		this.publicationDate = publicationDate;
	}

	/**
	 * @return the minutes
	 */
	public int getMinutes() {
		return minutes;
	}

	/**
	 * @param minutes the minutes to set
	 */
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	
	@Override
	public String toString() {
		return "Movie [publicationDate=" + publicationDate + ", minutes=" + minutes + "]";
	}
	
	
}
