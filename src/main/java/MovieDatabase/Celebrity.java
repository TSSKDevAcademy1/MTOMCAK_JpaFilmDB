package MovieDatabase;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Celebrity {

	@Id
	@GeneratedValue
	private long id;

	/** First name. */
	String firstName;
	/** Surname. */
	String surName;
	@Column(length = 3000)
	/** Date of birth contains only date without time. */
	Date dateOfBirth;
	/** Biography */
	String biography;

	/** List of director celebrity. */
	@ManyToMany(mappedBy = "directors")
	List<VideoArt> directed = new ArrayList<VideoArt>();
	/** List of actors celebrity. */
	@ManyToMany(mappedBy = "actors")
	List<VideoArt> actedAt = new ArrayList<VideoArt>();
	
	public Celebrity() {
	}
	
	
	public Celebrity(String firstName, String surName, Date dateOfBirth, String biography) {
		this.firstName = firstName;
		this.surName = surName;
		this.dateOfBirth = dateOfBirth;
		this.biography = biography;
	}


	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the surName
	 */
	public String getSurName() {
		return surName;
	}

	/**
	 * @param surName the surName to set
	 */
	public void setSurName(String surName) {
		this.surName = surName;
	}

	/**
	 * @return the dateOfBirth
	 */
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 * @return the biography
	 */
	public String getBiography() {
		return biography;
	}

	/**
	 * @param biography the biography to set
	 */
	public void setBiography(String biography) {
		this.biography = biography;
	}

	/**
	 * @return the directed
	 */
	public List<VideoArt> getDirected() {
		return directed;
	}

	/**
	 * @param directed the directed to set
	 */
	public void setDirected(List<VideoArt> directed) {
		this.directed = directed;
	}
	
	/** Add director to list. */
	public void addDirected(VideoArt celebrity) {
		directed.add(celebrity);
	}

	/** Remove director from list. */
	public void removeDirected(Celebrity celebrity) {
		directed.remove(celebrity);
	}

	/**
	 * @return the actedAt
	 */
	public List<VideoArt> getActedAt() {
		return actedAt;
	}

	/**
	 * @param actedAt the actedAt to set
	 */
	public void setActedAt(List<VideoArt> actedAt) {
		this.actedAt = actedAt;
	}
	
	/** Add actor to list. */
	public void addActor(VideoArt celebrity) {
		actedAt.add(celebrity);
	}

	/** Remove actor from list. */
	public void removeActor(VideoArt celebrity) {
		actedAt.remove(celebrity);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Celebrity [id=" + id + ", firstName=" + firstName + ", surName=" + surName + ", dateOfBirth="
				+ dateOfBirth + ", biography=" + biography + ", directed=" + directed + ", actedAt=" + actedAt + "]";
	}
}
