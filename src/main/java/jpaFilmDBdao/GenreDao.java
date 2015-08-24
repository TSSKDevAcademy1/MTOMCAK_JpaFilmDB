
package jpaFilmDBdao;

import java.util.List;

import MovieDatabase.Genre;

import sk.t_systems.akademia.jpaFilmDB.JpaHelper;

public class GenreDao implements ObjectDao{

	public void store(Object genre) {
		JpaHelper.beginTransaction();
		JpaHelper.getEntityManager().persist(genre);
		JpaHelper.committransaction();
	}

	public void load() {
		JpaHelper.beginTransaction();
		List<Genre> genre = JpaHelper.getEntityManager().createQuery("select g from Genre g", Genre.class)
				.getResultList();
		for (Genre g : genre) {
			System.out.println(g);
		}
		JpaHelper.committransaction();
	}

}
