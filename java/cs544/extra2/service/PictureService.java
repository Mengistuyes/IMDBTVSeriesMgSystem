package cs544.extra2.service;

import java.util.List;

import cs544.extra2.model.Picture;

public interface PictureService {
	  public long save(Picture genre);
	  public Picture get(long id);
	  public List<Picture> list();
	  public void update(long id, Picture genre);
	  public void delete(long id);
}
