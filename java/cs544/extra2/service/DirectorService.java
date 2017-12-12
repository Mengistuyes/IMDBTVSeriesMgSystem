package cs544.extra2.service;

import java.util.List;

import cs544.extra2.model.Director;

public interface DirectorService {
	  public long save(Director director);
	  public Director get(long id);
	  public List<Director> list();
	  public void update(long id, Director director);
	  public void delete(long id);
}
