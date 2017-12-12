package cs544.extra2.service;

import java.util.List;

import cs544.extra2.model.Comment;

public interface CommentService {
	  public long save(Comment comment);
	  public Comment get(long id);
	  public List<Comment> list();
	  public void update(long id, Comment comment);
	  public void delete(long id);
}
