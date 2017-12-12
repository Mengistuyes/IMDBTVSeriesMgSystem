package cs544.extra2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Director {
	@Id @GeneratedValue
	private long DirectorId;
	private String DirName;
	Director()
	{
		
	}
	public long getDirectorId() {
		return DirectorId;
	}
	public void setDirectorId(long directorId) {
		DirectorId = directorId;
	}
	public String getDirName() {
		return DirName;
	}
	public void setDirName(String dirName) {
		DirName = dirName;
	}
	
	
}
