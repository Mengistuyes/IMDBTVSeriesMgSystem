package cs544.extra2.dao;

import java.util.List;

import cs544.extra2.model.Comment;

public interface CommentDAO {
	  public long save(Comment comment);
	  public Comment get(long id);
	  public List<Comment> list();
	  public void update(long id, Comment comment);
	  public void delete(long id);
}
