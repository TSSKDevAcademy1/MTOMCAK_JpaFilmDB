package MovieDatabase;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Genre {
	
	@Id
	@GeneratedValue
	private long id;

	/** Genre name. */
	String name;
	/** Genre description. */
	String description;
	@ManyToMany(mappedBy = "genres")
	List<VideoArt> vArt = new ArrayList<VideoArt>();

	public Genre() {
	}

	/** Constructor using field parameters */
	public Genre(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Genre [name = " + name + ", description = " + description + "]";
	}
}
