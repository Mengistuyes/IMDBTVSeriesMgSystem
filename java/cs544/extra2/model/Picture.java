package cs544.extra2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Picture {
	@Id @GeneratedValue
	private long PictureId;
	private String PictureUrl;
	Picture()
	{
		
	}
	public long getPictureId() {
		return PictureId;
	}
	public void setPictureId(long pictureId) {
		PictureId = pictureId;
	}
	public String getPictureUrl() {
		return PictureUrl;
	}
	public void setPictureUrl(String pictureUrl) {
		PictureUrl = pictureUrl;
	}
	
}
