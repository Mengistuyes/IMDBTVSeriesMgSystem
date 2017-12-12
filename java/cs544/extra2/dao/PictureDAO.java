package cs544.extra2.dao;

import java.util.List;

import cs544.extra2.model.Picture;

public interface PictureDAO {
	  public long save(Picture genre);
	  public Picture get(long id);
	  public List<Picture> list();
	  public void update(long id, Picture genre);
	  public void delete(long id);
}
