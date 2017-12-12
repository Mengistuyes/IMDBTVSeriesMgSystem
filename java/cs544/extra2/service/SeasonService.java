package cs544.extra2.service;

import java.util.List;

import cs544.extra2.model.Season;

public interface SeasonService {
	  public long save(Season season);
	  public Season get(long id);
	  public List<Season> list();
	  public void update(long id, Season season);
	  public void delete(long id);
}
