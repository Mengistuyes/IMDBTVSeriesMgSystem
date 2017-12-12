package cs544.extra2.service;

import java.util.List;

import cs544.extra2.model.Episode;

public interface EpisodeService {
	  public long save(Episode episode);
	  public Episode get(long id);
	  public List<Episode> list();
	  public void update(long id, Episode episode);
	  public void delete(long id);
}
