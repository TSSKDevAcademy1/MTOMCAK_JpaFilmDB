package jpaFilmDBdao;

public interface ObjectDao {

	/** Save object to DB */
	public void store(Object object);

	/** Write all object from the DB. */
	public void load();

}