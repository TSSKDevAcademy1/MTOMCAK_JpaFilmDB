package MovieDatabase;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;

@Entity
public class Review {

	@Id
	@GeneratedValue
	private long id;

	/** Date of creation */
	Date dateTimeOfCreation = new Date();

	 @ManyToOne
	/**List of reviews*/
	Review reviewed;
	/** List of video art */
	@ManyToOne
	VideoArt videoArt;
	/** Rating of video art range <1,10> */
	int rating;
	@Column(length = 5000)
	String text;

	@PrePersist
	private void currentDate() {
		dateTimeOfCreation = new Date();
	}
	
	public Review() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**Constructor using field*/
	public Review(int rating, String text) {
		super();
		this.rating = rating;
		this.text = text;
	}


	/**
	 * @return the reviewed
	 */
	public Review getReviewed() {
		return reviewed;
	}

	/**
	 * @param reviewed the reviewed to set
	 */
	public void setReviewed(Review reviewed) {
		this.reviewed = reviewed;
	}

	/**
	 * @return the videoArt
	 */
	public VideoArt getVideoArt() {
		return videoArt;
	}

	/**
	 * @param videoArt the videoArt to set
	 */
	public void setVideoArt(VideoArt videoArt) {
		this.videoArt = videoArt;
	}

	/**
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}

	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}

	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Review [dateTimeOfCreation=" + dateTimeOfCreation + ", reviewed=" + reviewed + ", videoArt=" + videoArt
				+ ", rating=" + rating + ", text=" + text + "]";
	}
}
