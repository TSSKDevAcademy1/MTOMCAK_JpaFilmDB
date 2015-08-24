package MovieDatabase;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public abstract class VideoArt {

	@Id
	@GeneratedValue
	private long id;

	/** Art name */
	String name;
	/** Year of publication - not date */
	int yearOfPublication;

	/** Genres list of video art. */
	@ManyToMany(cascade = CascadeType.ALL)
	List<Genre> genres = new ArrayList<Genre>();

	/** Directors list of video art. */
	@JoinTable(name = "actors")
	@ManyToMany(cascade = CascadeType.ALL)
	List<Celebrity> directors = new ArrayList<Celebrity>();
	
	/** Actors list of video art. */
	@JoinTable(name = "directors")
	@ManyToMany(cascade = CascadeType.ALL)
	List<Celebrity> actors = new ArrayList<Celebrity>();

	/** Reviews list of video art. */
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "videoArt")
	List<Review> reviews = new ArrayList<Review>();
	/** Additional information list of video art. */
	@ElementCollection
	List<String> additionalInfo = new ArrayList<String>();

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the yearOfPublication
	 */
	public int getYearOfPublication() {
		return yearOfPublication;
	}

	/**
	 * @param yearOfPublication
	 *            the yearOfPublication to set
	 */
	public void setYearOfPublication(int yearOfPublication) {
		this.yearOfPublication = yearOfPublication;
	}

	/**
	 * @return the genres
	 */
	public List<Genre> getGenres() {
		return genres;
	}

	/**
	 * @param genres
	 *            the genres to set
	 */
	public void setGenres(List<Genre> genres) {
		this.genres = genres;
	}

	/** Add genre to list. */
	public void addGenre(Genre genre) {
		genres.add(genre);
	}

	/** Remove genre from list. */
	public void removeGenre(Genre genre) {
		genres.remove(genre);
	}

	/**
	 * @return the directors
	 */
	public List<Celebrity> getDirectors() {
		return directors;
	}

	/**
	 * @param directors
	 *            the directors to set
	 */
	public void setDirectors(List<Celebrity> directors) {
		this.directors = directors;
	}

	/** Add director to list. */
	public void addDirector(Celebrity celebrity) {
		directors.add(celebrity);
	}

	/** Remove director from list. */
	public void removeDirector(Celebrity celebrity) {
		directors.remove(celebrity);
	}

	/**
	 * @return the actors
	 */
	public List<Celebrity> getActors() {
		return actors;
	}

	/**
	 * @param actors
	 *            the actors to set
	 */
	public void setActors(List<Celebrity> actors) {
		this.actors = actors;
	}

	/** Add actor to list. */
	public void addActor(Celebrity celebrity) {
		actors.add(celebrity);
	}

	/** Remove actor from list. */
	public void removeActor(Celebrity celebrity) {
		actors.remove(celebrity);
	}

	/**
	 * @return the reviews
	 */
	public List<Review> getReviews() {
		return reviews;
	}

	/**
	 * @param reviews
	 *            the reviews to set
	 */
	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

	/** Add review to list. */
	public void addReview(Review review) {
		reviews.add(review);
	}

	/** Remove review from list. */
	public void removeReview(Review review) {
		reviews.remove(review);
	}

	/**
	 * @return the additionalInfo
	 */
	public List<String> getAdditionalInfo() {
		return additionalInfo;
	}

	/**
	 * @param additionalInfo
	 *            the additionalInfo to set
	 */
	public void setAdditionalInfo(List<String> additionalInfo) {
		this.additionalInfo = additionalInfo;
	}

	/** Add a to list. */
	public void addAdditionalInfo(String addInfo) {
		additionalInfo.add(addInfo);
	}

	/** Remove review from list. */
	public void removeAdditionalInfo(String addInfo) {
		additionalInfo.remove(addInfo);
	}
}