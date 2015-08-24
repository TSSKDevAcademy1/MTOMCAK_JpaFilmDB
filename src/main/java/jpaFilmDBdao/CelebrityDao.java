package jpaFilmDBdao;


import MovieDatabase.Celebrity;
import MovieDatabase.Review;
import MovieDatabase.VideoArt;
import sk.t_systems.akademia.jpaFilmDB.JpaHelper;

public class CelebrityDao implements ObjectDao {

	public void store(Object celebrity) {
		JpaHelper.beginTransaction();
		JpaHelper.getEntityManager().persist(celebrity);
		JpaHelper.committransaction();
	}

	/** Add director to video art. */
	public void addDirectorToVideoArt(Celebrity director, VideoArt vArt) {
		vArt.addDirector(director);
		JpaHelper.beginTransaction();
		JpaHelper.getEntityManager().persist(vArt);
		JpaHelper.committransaction();
	}

	/** Add actor to video art. */
	public void addActorToVideoArt(Celebrity actor, VideoArt vArt) {
		vArt.addDirector(actor);
		JpaHelper.beginTransaction();
		JpaHelper.getEntityManager().persist(vArt);
		JpaHelper.committransaction();
	}

	/** Add review to video art. */
	public void addReviewToVideoArt(Review review, VideoArt vArt) {
		vArt.addReview(review);
		JpaHelper.beginTransaction();
		JpaHelper.getEntityManager().persist(vArt);
		JpaHelper.committransaction();
	}
	
	public void load() {
		// TODO Auto-generated method stub
		
	}

}
