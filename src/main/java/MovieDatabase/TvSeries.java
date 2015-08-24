package MovieDatabase;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Inheritance;

@Entity
@Inheritance
public class TvSeries extends VideoArt {

	/** Series count. */
	int seriesCount;
	/** Episode count. */
	int episodeCount;
	/** Start year. */
	Date startYear;
	/** End year. */
	Date endYear;

	public TvSeries() {
	}

	public TvSeries(int seriesCount, int episodeCount, Date startYear, Date endYear) {
		this.seriesCount = seriesCount;
		this.episodeCount = episodeCount;

		/** Catch start, end date parse exception. */
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			Date sYear = dateFormat.parse(startYear.toString());
			Date eYear = dateFormat.parse(endYear.toString());

			this.startYear = sYear;
			this.endYear = eYear;

		} catch (ParseException e) {
			System.out.println(e);
		}
	}

	/**
	 * @return the seriesCount
	 */
	public int getSeriesCount() {
		return seriesCount;
	}

	/**
	 * @param seriesCount the seriesCount to set
	 */
	public void setSeriesCount(int seriesCount) {
		this.seriesCount = seriesCount;
	}

	/**
	 * @return the episodeCount
	 */
	public int getEpisodeCount() {
		return episodeCount;
	}

	/**
	 * @param episodeCount the episodeCount to set
	 */
	public void setEpisodeCount(int episodeCount) {
		this.episodeCount = episodeCount;
	}

	/**
	 * @return the startYear
	 */
	public Date getStartYear() {
		return startYear;
	}

	/**
	 * @param startYear the startYear to set
	 */
	public void setStartYear(Date startYear) {
		this.startYear = startYear;
	}

	/**
	 * @return the endYear
	 */
	public Date getEndYear() {
		return endYear;
	}

	/**
	 * @param endYear the endYear to set
	 */
	public void setEndYear(Date endYear) {
		this.endYear = endYear;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TvSeries [seriesCount=" + seriesCount + ", episodeCount=" + episodeCount + ", startYear=" + startYear
				+ ", endYear=" + endYear + "]";
	}

}
