package cs544.extra2.service;

import java.util.List;

import cs544.extra2.model.Genre;

public interface GenreService {
	  public long save(Genre genre);
	  public Genre get(long id);
	  public List<Genre> list();
	  public void update(long id, Genre genre);
	  public void delete(long id);
}
