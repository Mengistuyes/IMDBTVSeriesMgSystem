package cs544.extra2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class CastMember {
	@Id @GeneratedValue
	private long CastMemberId;
	private String CastMemberName;
	private String Description;
	CastMember()
	{
		
	}
	public long getCastMemberId() {
		return CastMemberId;
	}
	public void setCastMemberId(long castMemberId) {
		CastMemberId = castMemberId;
	}
	public String getCastMemberName() {
		return CastMemberName;
	}
	public void setCastMemberName(String castMemberName) {
		CastMemberName = castMemberName;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	
}
