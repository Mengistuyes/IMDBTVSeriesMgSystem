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
public class Episode {
	@Id @GeneratedValue
	private long EpisodeId;
	@OneToMany
	@JoinColumn(name="CastMemberId")
	private List<CastMember> CastMembers;
	private String Description;
	@Temporal(TemporalType.DATE)
	private Date AiredDate;
	@OneToMany
	@JoinColumn(name="CastMemberId")
	private List<Comment> comments;
	Episode()
	{
		
	}
	public long getEpisodeId() {
		return EpisodeId;
	}
	public void setEpisodeId(int episodeId) {
		EpisodeId = episodeId;
	}
	public List<CastMember> getCastMembers() {
		return CastMembers;
	}
	public void setCastMembers(List<CastMember> castMembers) {
		CastMembers = castMembers;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public Date getAiredDate() {
		return AiredDate;
	}
	public void setAiredDate(Date airedDate) {
		AiredDate = airedDate;
	}
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	

}
