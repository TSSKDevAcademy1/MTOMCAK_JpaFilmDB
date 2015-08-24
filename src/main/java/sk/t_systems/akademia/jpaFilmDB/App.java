package sk.t_systems.akademia.jpaFilmDB;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeParseException;
import java.util.Date;

import org.hibernate.persister.walking.internal.StandardAnyTypeDefinition;

import MovieDatabase.Celebrity;
import MovieDatabase.Genre;
import MovieDatabase.Movie;
import MovieDatabase.Review;
import MovieDatabase.TvSeries;
import jpaFilmDBdao.CelebrityDao;
import jpaFilmDBdao.GenreDao;
import jpaFilmDBdao.VideoArtDao;

/**
 * Create film database...
 *
 */
public class App {

	public static void main(String[] args) {
		/**Vide art dao*/
		VideoArtDao vDao = new VideoArtDao();
		
		/**Genre dao*/
		GenreDao gDao = new GenreDao();
		
		/**Celebrity dao*/
		CelebrityDao cDao = new CelebrityDao();
		
		
		try {
			/** Date format. */
			SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy");
			/** Date format. */
			Date publicationDate = df.parse("16.10.2007");
			Date endDate = df.parse("15.10.2007");

//			/** Add film */
//			/** Film 1 */
//			Movie m1 = new Movie(publicationDate, 120);
//			m1.setName("Titanic");
//			m1.addActor(new Celebrity("Leonardo", "Dicaprio", df.parse("15.10.1977"),
//					"DiCaprio began attracting the attention of producers, who cast him in bit part roles"));
//			m1.addActor(new Celebrity("Kate", "Winslet", df.parse("15.10.1997"),
//					"Ask Kate Winslet what she likes about any of her characters, and the word... "));
//			m1.addDirector(new Celebrity("James", "Cameron", df.parse("15.1.1957"),
//					"James Cameron is the best makac of the world !!!!"));
//			m1.addGenre(new Genre("Roman", "Romantic scene too much."));
//			m1.addGenre(new Genre("Drama", "Dramatic scene"));
//			m1.addReview(new Review(9, "Best film on the planet :-) 1"));
//			m1.addReview(new Review(9, "When Lewis Bodine is talking about the moment the iceberg hit the Titanic"));
//			m1.addReview(new Review(9, "Nice ship and ice :-D"));
//			m1.addAdditionalInfo("A seventeen-year-old aristocrat falls in love with "
//					+ "a kind, but poor artist aboard the luxurious, ill-fated R.M.S. Titanic.");
//			m1.setPublicationDate(endDate);
//
//			vDao.store(m1);
//			vDao.load();
//
//			/** Add Tv series */
//			/** Add TV series */
//			/** TV series 1 */
//			TvSeries tvS1 = new TvSeries(20, 10, df.parse("10.2.2007"), df.parse("10.2.2007"));
//			tvS1.setName("Bing bang theory");
//			tvS1.addActor(new Celebrity("Sheldon", "Cooper", df.parse("15.10.1975"),
//					"Inteligent person, profesor of theoretica...."));
//			tvS1.addActor(new Celebrity("Jim", "Parsons", df.parse("5.5.1984"), "No bibliography !"));
//			tvS1.addDirector(
//					new Celebrity("Mark", "Cendrowski", df.parse("15.1.1967"), "Direct bing bang theory and...."));
//			tvS1.addGenre(new Genre("Sitcom", "Sitcom for intelligent people."));
//			tvS1.addReview(new Review(9, "Best film on the planet :-) 1"));
//			tvS1.addReview(new Review(9, "Best sitcom what I ever seen."));
//			tvS1.addReview(new Review(9, "It's a great show"));
//			tvS1.addAdditionalInfo("The Big Bang Theory is an American sitcom created by Chuck "
//					+ "Lorre and Bill Prady, both of whom serve as executive producers on");
//			tvS1.setYearOfPublication(2001);
//			vDao.store(tvS1);
			
//			
//			/**Add genre to DB and load from DB*/
//			gDao.store(new Genre("Horor", "Scary film with blood and monster !"));
//			gDao.store(new Genre("Fairytye", "Fairytale land, person and animal!"));
			gDao.load();
			
			/**Add genre to video art*/
//			m1.addGenre(new Genre("Fairytye", "Fairytale land, person and animal!"));
//			m1.addGenre(new Genre("Horor", "Scary film with blood and monster !"));
//			
			
			/**Add celebrity without films and serials where played or directored.*/
//			cDao.store(new Celebrity("Eddie", "Murphy", df.parse("11.2.1986"), "Showman and comic"));
//			cDao.store(new Celebrity("Jackie", "Chan", df.parse("11.2.1986"), "Kung-fu master"));
//			cDao.load();
			
			/**Add director to video art*/
			cDao.addDirectorToVideoArt(new Celebrity("Mark", "Spencer", df.parse("11.08.1945"), "sdfasdf"), new Movie(publicationDate, 90));
			
			/**Add actor to video art*/
			cDao.addActorToVideoArt(new Celebrity("Will", "Smith", df.parse("1.12.1985"), "Black actor"), new Movie(publicationDate, 90));
			
			/**Add review to video art*/
			cDao.addReviewToVideoArt(new Review(5, "Good film"), new Movie(publicationDate, 90));
			
			/** All films publication with inserted year*/
			//vDao.showAllFilmInDate(publicationDate);
			/**
			 * minimalne 5 realnych filmov, 5 serialov, 8 celebrit, 5 zanrov a
			 * pre kazdy video art vlozte 1-3 review. P
			 */

		} catch (ParseException e) {
			System.out.println(e);
		} finally {
			JpaHelper.close();
		}
	}
}
