package jpaFilmDBdao;

import java.util.Date;
import java.util.List;

import MovieDatabase.VideoArt;
import sk.t_systems.akademia.jpaFilmDB.JpaHelper;

public class VideoArtDao implements ObjectDao {

	/** store video art to database */
	public void store(Object videoArt) {
		JpaHelper.beginTransaction();
		JpaHelper.getEntityManager().persist(videoArt);
		JpaHelper.committransaction();
	}

	/** laod video art from database */
	public void load() {
		JpaHelper.beginTransaction();
		List<VideoArt> videoArt = JpaHelper.getEntityManager().createQuery("select va from VideoArt va", VideoArt.class)
				.getResultList();
		for (VideoArt v : videoArt) {
			System.out.println(v);
		}
		JpaHelper.committransaction();
	}

	public void showAllFilmInDate(Date date) {
		JpaHelper.beginTransaction();
		List<VideoArt> videoArt = JpaHelper.getEntityManager().createQuery("select va from VideoArt va where va.yearOfPublication = :date", VideoArt.class).setParameter("date", date)
				.getResultList();
		for (VideoArt v : videoArt) {
			System.out.println(v);
		}
		JpaHelper.committransaction();
	}

}
