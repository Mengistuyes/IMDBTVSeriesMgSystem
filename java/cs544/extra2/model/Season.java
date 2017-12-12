package cs544.extra2.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Season {
	@Id @GeneratedValue
	private long SeasonId;
	@OneToMany
	@JoinColumn(name="EpisodeId")
	private List<Episode> episodes;
	private String PosterUrl;
	private String Summary;
	@Temporal(TemporalType.DATE)
	private Date Year;
	Season()
	{
		
	}
	public long getSeasonId() {
		return SeasonId;
	}
	public void setSeasonId(int seasonId) {
		SeasonId = seasonId;
	}
	public List<Episode> getEpisodes() {
		return episodes;
	}
	public void setEpisodes(List<Episode> episodes) {
		this.episodes = episodes;
	}
	public String getPosterUrl() {
		return PosterUrl;
	}
	public void setPosterUrl(String posterUrl) {
		PosterUrl = posterUrl;
	}
	public String getSummary() {
		return Summary;
	}
	public void setSummary(String summary) {
		Summary = summary;
	}
	public Date getYear() {
		return Year;
	}
	public void setYear(Date year) {
		Year = year;
	}
	

}
