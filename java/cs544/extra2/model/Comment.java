package cs544.extra2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Comment {
	@Id @GeneratedValue
	private long CommentId;
	private String Comment;
	Comment()
	{
		
	}
	public long getCommentId() {
		return CommentId;
	}
	public void setCommentId(long commentId) {
		CommentId = commentId;
	}
	public String getComment() {
		return Comment;
	}
	public void setComment(String comment) {
		Comment = comment;
	}
	
}
