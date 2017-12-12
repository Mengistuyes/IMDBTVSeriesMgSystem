package cs544.extra2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Genre {
	@Id @GeneratedValue
	private long GenreId;
	private String GenreName;
	Genre()
	{
		
	}
	public long getGenreId() {
		return GenreId;
	}
	public void setGenreId(int genreId) {
		GenreId = genreId;
	}
	public String getGenreName() {
		return GenreName;
	}
	public void setGenreName(String genreName) {
		GenreName = genreName;
	}
	
}
