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
public class Actor {
	@Id @GeneratedValue
	private long ActorId;
	private String Name;
	@Temporal(TemporalType.DATE)
	private Date PlaceOfBirth;
	private String Biography; 
	@OneToMany
	@JoinColumn(name="PictureId")
	private List<Picture> pictures;
	Actor()
	{
		
	}
	public long getActorId() {
		return ActorId;
	}
	public void setActorId(int actorId) {
		ActorId = actorId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Date getPlaceOfBirth() {
		return PlaceOfBirth;
	}
	public void setPlaceOfBirth(Date placeOfBirth) {
		PlaceOfBirth = placeOfBirth;
	}
	public String getBiography() {
		return Biography;
	}
	public void setBiography(String biography) {
		Biography = biography;
	}
	public List<Picture> getPictures() {
		return pictures;
	}
	public void setPictures(List<Picture> pictures) {
		this.pictures = pictures;
	}

}
